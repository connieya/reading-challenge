package java.io.refactoring.buckpal.account.application;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.io.refactoring.buckpal.account.application.port.in.SendMoneyCommand;
import java.io.refactoring.buckpal.account.application.port.in.SendMoneyUseCase;
import java.io.refactoring.buckpal.account.application.port.out.AccountLock;
import java.io.refactoring.buckpal.account.application.port.out.LoadAccountPort;
import java.io.refactoring.buckpal.account.application.port.out.UpdateAccountStatePort;

@RequiredArgsConstructor
@Transactional
public class SendMoneyService implements SendMoneyUseCase {

    private final LoadAccountPort loadAccountPort;
    private final AccountLock accountLock;
    private final UpdateAccountStatePort updateAccountStatePort;

    @Override
    public boolean sendMoney(SendMoneyCommand command) {
        //  TODO: 비즈니스 규칙 검증
        // TODO : 모델 상태 조작
        // TODO: 출력 값 반환
        return false;
    }
}
