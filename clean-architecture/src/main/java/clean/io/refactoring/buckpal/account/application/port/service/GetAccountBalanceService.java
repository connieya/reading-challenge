package clean.io.refactoring.buckpal.account.application.port.service;

import lombok.RequiredArgsConstructor;

import clean.io.refactoring.buckpal.account.application.port.in.GetAccountBalanceQuery;
import clean.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.Money;
import java.time.LocalDateTime;

import static clean.io.refactoring.buckpal.account.domain.Account.*;

@RequiredArgsConstructor
public class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId , LocalDateTime.now())
                .calculateBalance();
    }
}
