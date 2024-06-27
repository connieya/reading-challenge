package clean.io.refactoring.buckpal.account.application.port.in;


public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);
}
