package clean.io.refactoring.buckpal.account.application.port.out;

import clean.io.refactoring.buckpal.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);
}
