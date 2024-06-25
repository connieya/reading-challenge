package java.io.refactoring.buckpal.account.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.refactoring.buckpal.account.application.port.in.SendMoneyCommand;
import java.io.refactoring.buckpal.account.application.port.in.SendMoneyUseCase;
import java.io.refactoring.buckpal.account.domain.Account;
import java.io.refactoring.buckpal.account.domain.Money;

import static java.io.refactoring.buckpal.account.domain.Account.*;

@RestController
@RequiredArgsConstructor
 class SendMoneyController {
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
