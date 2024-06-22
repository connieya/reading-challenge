package java.io.refactoring.buckpal.account.application.port.in;

import lombok.Getter;

import java.io.refactoring.buckpal.account.domain.AccountId;
import java.io.refactoring.buckpal.account.domain.Money;

import static java.util.Objects.requireNonNull;

@Getter
public class SendMoneyCommand {

    private final AccountId sourceAccountId;
    private final AccountId targetAccountId;
    private final Money money;

    public SendMoneyCommand(
            AccountId sourceAccountId,
            AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        requireNonNull(sourceAccountId);
        requireNonNull(targetAccountId);
        requireNonNull(money);
        requireGreaterThan(money, 0);
    }

    private void requireGreaterThan(Money money, int i) {

    }
}
