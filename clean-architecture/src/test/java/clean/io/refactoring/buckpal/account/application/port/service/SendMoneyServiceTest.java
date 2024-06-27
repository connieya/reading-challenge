package clean.io.refactoring.buckpal.account.application.port.service;

import clean.io.refactoring.buckpal.account.application.port.in.SendMoneyCommand;
import clean.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.Account.AccountId;
import clean.io.refactoring.buckpal.account.domain.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

class SendMoneyServiceTest {

    private final LoadAccountPort loadAccountPort =
            Mockito.mock(LoadAccountPort.class);


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

}