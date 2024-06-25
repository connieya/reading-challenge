package java.io.refactoring.buckpal.account.adapter.out.persistence;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import java.io.refactoring.buckpal.account.application.port.out.UpdateAccountStatePort;
import java.io.refactoring.buckpal.account.domain.Account;
import java.io.refactoring.buckpal.account.domain.Activity;
import java.time.LocalDateTime;
import java.util.List;

import static java.io.refactoring.buckpal.account.domain.Account.*;

@RequiredArgsConstructor
@Component
class AccountPersistenceAdapter implements LoadAccountPort , UpdateAccountStatePort {
     private final SpringDataAccountRepository accountRepository;
     private final ActivityRepository activityRepository;
     private final AccountMapper accountMapper;

     @Override
     public Account loadAccount(
             AccountId accountId,
             LocalDateTime baselineDate) {

          AccountJpaEntity account =
                  accountRepository.findById(accountId.getValiue())
                          .orElseThrow(EntityNotFoundException::new);

          List<ActivityJpaEntity> activities = activityRepository.findByOwnerSince(
                  accountId.getValiue(),
                  baselineDate
          );

          Long withdrawalBalance = orZero(activityRepository
                  .getWithdrawalBalanceUntil(
                  accountId.getValiue(),
                  baselineDate
          ));

          Long depositBalance = orZero(activityRepository
                  .getDepositBalanceUntil(
                          accountId.getValiue(),
                          baselineDate
                  ));


          return accountMapper.mapToDomainEntity(
                  account,
                  activities,
                  withdrawalBalance,
                  depositBalance
          );
     }

     private Long orZero(Long value) {
          return value == null ? 0L : value;
     }

     @Override
     public void updateActivities(Account account) {
          for (Activity activity : account.getActivityWindow().getActivities()) {
               if (activity.getId() == null) {
                    activityRepository.save(accountMapper.mapToJpaEntity(activity));
               }
          }
     }
}
