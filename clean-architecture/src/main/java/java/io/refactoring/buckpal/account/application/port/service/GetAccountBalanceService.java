package java.io.refactoring.buckpal.account.application.port.service;

import lombok.RequiredArgsConstructor;

import java.io.refactoring.buckpal.account.application.port.in.GetAccountBalanceQuery;
import java.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import java.io.refactoring.buckpal.account.domain.AccountId;
import java.io.refactoring.buckpal.account.domain.Money;
import java.time.LocalDateTime;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId , LocalDateTime.now())
                .calculateBalance();
    }
}
