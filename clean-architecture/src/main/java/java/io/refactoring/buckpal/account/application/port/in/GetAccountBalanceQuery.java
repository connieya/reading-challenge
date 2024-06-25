package java.io.refactoring.buckpal.account.application.port.in;

import java.io.refactoring.buckpal.account.domain.Account;
import java.io.refactoring.buckpal.account.domain.Money;

import static java.io.refactoring.buckpal.account.domain.Account.*;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
