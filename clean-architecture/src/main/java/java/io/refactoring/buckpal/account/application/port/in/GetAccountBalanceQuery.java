package java.io.refactoring.buckpal.account.application.port.in;

import java.io.refactoring.buckpal.account.domain.AccountId;
import java.io.refactoring.buckpal.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
