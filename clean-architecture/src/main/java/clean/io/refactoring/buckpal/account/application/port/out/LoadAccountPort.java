package clean.io.refactoring.buckpal.account.application.port.out;

import clean.io.refactoring.buckpal.account.domain.Account;
import java.time.LocalDateTime;

import static clean.io.refactoring.buckpal.account.domain.Account.*;

public interface LoadAccountPort {
  Account loadAccount(AccountId accountId , LocalDateTime baselineDate);
}
