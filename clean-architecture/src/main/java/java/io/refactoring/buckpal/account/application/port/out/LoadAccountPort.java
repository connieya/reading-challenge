package java.io.refactoring.buckpal.account.application.port.out;

import java.io.refactoring.buckpal.account.domain.Account;
import java.io.refactoring.buckpal.account.domain.AccountId;
import java.time.LocalDateTime;

public interface LoadAccountPort {
  Account loadAccount(AccountId accountId , LocalDateTime baselineDate);
}
