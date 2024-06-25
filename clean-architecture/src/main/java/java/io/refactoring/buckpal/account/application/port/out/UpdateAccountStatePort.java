package java.io.refactoring.buckpal.account.application.port.out;

import java.io.refactoring.buckpal.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);
}
