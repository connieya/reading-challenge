package java.io.refactoring.buckpal.account.application.port.in;

import java.io.refactoring.buckpal.account.domain.Money;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);
}
