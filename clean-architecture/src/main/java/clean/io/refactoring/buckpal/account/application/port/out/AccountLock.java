package clean.io.refactoring.buckpal.account.application.port.out;

import clean.io.refactoring.buckpal.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);
}
