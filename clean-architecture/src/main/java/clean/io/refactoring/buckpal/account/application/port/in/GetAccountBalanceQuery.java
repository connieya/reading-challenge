package clean.io.refactoring.buckpal.account.application.port.in;


import clean.io.refactoring.buckpal.account.domain.Account.AccountId;
import clean.io.refactoring.buckpal.account.domain.Money;

public interface GetAccountBalanceQuery {
    Money getAccountBalance(AccountId accountId);
}
