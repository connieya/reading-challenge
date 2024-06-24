package java.io.refactoring.buckpal.account.application.port.in;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.io.refactoring.buckpal.account.domain.AccountId;
import java.io.refactoring.buckpal.account.domain.Money;
import java.io.refactoring.buckpal.common.SelfValidating;


@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;
    @NotNull
    private final AccountId targetAccountId;
    @NotNull
    private final Money money;

    public SendMoneyCommand(
            AccountId sourceAccountId,
            AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        requireGreaterThan(money, 0);
        this.validationSelf();
    }

    private void requireGreaterThan(Money money, int i) {

    }
}
