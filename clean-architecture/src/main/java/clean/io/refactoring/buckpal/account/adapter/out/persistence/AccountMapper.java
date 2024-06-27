package clean.io.refactoring.buckpal.account.adapter.out.persistence;

import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.Activity;
import clean.io.refactoring.buckpal.account.domain.ActivityWindow;
import clean.io.refactoring.buckpal.account.domain.Money;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static clean.io.refactoring.buckpal.account.domain.Account.*;
import static clean.io.refactoring.buckpal.account.domain.Account.withId;
import static clean.io.refactoring.buckpal.account.domain.Activity.*;


@Component
class AccountMapper {

    Account mapToDomainEntity(
            AccountJpaEntity account ,
            List<ActivityJpaEntity> activities,
            Long withdrawalBalance,
            Long depositBalance
    ) {
        Money baselineBalance = Money.subtract(
          Money.of(depositBalance),
          Money.of(withdrawalBalance)
        );

        return withId(
                new AccountId(account.getId()),
                baselineBalance,
                mapToActivityWindow(activities));
    }

    private ActivityWindow mapToActivityWindow(List<ActivityJpaEntity> activities) {
        List<Activity> mappedActivities = new ArrayList<>();

        for (ActivityJpaEntity activity : activities) {
            mappedActivities.add(new Activity(
                    new ActivityId(activity.getId()),
                    new AccountId(activity.getOwnerAccountId()),
                    new AccountId(activity.getSourceAccountId()),
                    new AccountId(activity.getTargetAccountId()),
                    activity.getTimestamp(),
                    Money.of(activity.getAmount())));
        }

        return new ActivityWindow(mappedActivities);
    }

    ActivityJpaEntity mapToJpaEntity(Activity activity) {
        return new ActivityJpaEntity(
                activity.getId() == null ? null : activity.getId().getValue(),
                activity.getTimestamp(),
                activity.getOwnerAccountId().getValiue(),
                activity.getSourceAccountId().getValiue(),
                activity.getTargetAccountId().getValiue(),
                activity.getMoney().getAmount().longValue()
        );
    }
}
