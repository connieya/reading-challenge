package org.example.chapter05.mockandstub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ControllerTest {

    @Test
    @DisplayName("목 라이브러리에서 Mock 클래스를 사용해 목을 생성")
    void sendingAGreetingsEmail() {
        // given
        IEmailGateway mock = mock(IEmailGateway.class);
        Controller sut = new Controller(mock);

        // when
        sut.greetUser("user@email.com");

        // then
        verify(mock, times(1)).sendGreetingsEmail("user@email.com");
    }

    @Test
    @DisplayName("Mock 클래스를 사용해 스텁을 생성")
    void creatingAReport() {
        // given
        IDatabase stub = mock(IDatabase.class);

        when(stub.getNumberOfUsers()).thenReturn(10);
        Controller sut = new Controller(stub);

        // when
        Report report = sut.createReport();

        // then
        assertEquals(10,report.getNumberOfUsers());
        // 스텁으로 상호 작용 검증
        verify(stub, times(1)).getNumberOfUsers();
    }

}