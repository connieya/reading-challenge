package java.io.refactoring.buckpal.account.application.port.out;

import java.io.refactoring.buckpal.account.domain.Account;
import java.time.LocalDateTime;

import static java.io.refactoring.buckpal.account.domain.Account.*;

public interface LoadAccountPort {
  Account loadAccount(AccountId accountId , LocalDateTime baselineDate);
}
