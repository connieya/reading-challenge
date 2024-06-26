package clean.io.refactoring.buckpal.account.adapter.in.web;

import clean.io.refactoring.buckpal.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import clean.io.refactoring.buckpal.account.application.port.in.SendMoneyCommand;
import clean.io.refactoring.buckpal.account.application.port.in.SendMoneyUseCase;
import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.Money;

import static clean.io.refactoring.buckpal.account.domain.Account.*;


@WebAdapter
@RestController
@RequiredArgsConstructor
public class SendMoneyController {
    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping("/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(@PathVariable("sourceAccountId") Long sourceAccountId,
                   @PathVariable("targetAccountId") Long targetAccountId,
                   @PathVariable("amount") Long amount
                   ) {
        SendMoneyCommand command = new SendMoneyCommand(
                new AccountId(sourceAccountId),
                new AccountId(targetAccountId),
                Money.of(amount));

        sendMoneyUseCase.sendMoney(command);
    }
}
