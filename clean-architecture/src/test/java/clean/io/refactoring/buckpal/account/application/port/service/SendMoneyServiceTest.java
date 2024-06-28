package clean.io.refactoring.buckpal.account.application.port.service;

import clean.io.refactoring.buckpal.account.application.port.in.SendMoneyCommand;
import clean.io.refactoring.buckpal.account.application.port.out.AccountLock;
import clean.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import clean.io.refactoring.buckpal.account.application.port.out.UpdateAccountStatePort;
import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.Account.AccountId;
import clean.io.refactoring.buckpal.account.domain.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

class SendMoneyServiceTest {

    private final LoadAccountPort loadAccountPort =
            Mockito.mock(LoadAccountPort.class);

    private final AccountLock accountLock =
            Mockito.mock(AccountLock.class);

    private final UpdateAccountStatePort updateAccountStatePort =
            Mockito.mock(UpdateAccountStatePort.class);

    private final SendMoneyService sendMoneyService =
            new SendMoneyService(loadAccountPort,accountLock,updateAccountStatePort, moneyTransferProperties());

    @Test
    void transactionSucceeds() {
        Account sourceAccount = givenSourceAccount();
        Account targetAccount = giventTargetAccount();

        givenWithdrawalWillSucceed(sourceAccount);
        givenDepositWillSucceed(targetAccount);

        Money money = Money.of(500L);

        SendMoneyCommand command = new SendMoneyCommand(
                sourceAccount.getId().get(),
                targetAccount.getId().get(),
                money
        );


        boolean success = sendMoneyService.sendMoney(command);

        assertThat(success).isTrue();

        AccountId sourceAccountId = sourceAccount.getId().get();
        AccountId targetAccountId = targetAccount.getId().get();

        then(accountLock).should().lockAccount(eq(sourceAccountId));
        then(sourceAccount).should().withdraw(eq(money) ,eq(targetAccountId));
        then(accountLock).should().releaseAccount(eq(sourceAccountId));

        then(accountLock).should().lockAccount(eq(targetAccountId));
        then(targetAccount).should().deposit(eq(money),eq(sourceAccountId));
        then(accountLock).should().releaseAccount(eq(targetAccountId));

        thenAccountsHaveBeenUpdated(sourceAccountId, targetAccountId);


    }

    private void thenAccountsHaveBeenUpdated(AccountId ... accountIds) {
        ArgumentCaptor<Account> argumentCaptor = ArgumentCaptor.forClass(Account.class);
        then(updateAccountStatePort).should(times(accountIds.length))
                .updateActivities(argumentCaptor.capture());

        List<AccountId> updateAccountIds = argumentCaptor.getAllValues()
                .stream()
                .map(Account::getId)
                .map(Optional::get)
                .collect(Collectors.toList());

        for (AccountId accountId : accountIds) {
            assertThat(updateAccountIds).contains(accountId);
        }
    }


    private void givenDepositWillSucceed(Account account) {
        given(account.deposit(any(Money.class) , any(AccountId.class)))
                .willReturn(true);
    }

    private void givenDepositWillFail(Account account) {
        given(account.deposit(any(Money.class) , any(AccountId.class)))
                .willReturn(false);
    }


    private void givenWithdrawalWillFail(Account account) {
        given(account.withdraw(any(Money.class), any(AccountId.class)))
                .willReturn(false);
    }

    private void givenWithdrawalWillSucceed(Account account) {
        given(account.withdraw(any(Money.class), any(AccountId.class)))
                .willReturn(true);
    }
    private Account giventTargetAccount() {
        return giventAnAccountWithId(new AccountId(42L));
    }

    private Account givenSourceAccount() {
        return giventAnAccountWithId(new AccountId(41L));
    }

    private Account giventAnAccountWithId(AccountId id) {
        Account account = Mockito.mock(Account.class);
        given(account.getId())
                .willReturn(Optional.of(id));

        given(loadAccountPort.loadAccount(eq(account.getId()).get() , any(LocalDateTime.class)))
                .willReturn(account);
        return account;
    }

    private MoneyTransferProperties moneyTransferProperties() {
        return new MoneyTransferProperties(Money.of(Long.MAX_VALUE));
    }

}