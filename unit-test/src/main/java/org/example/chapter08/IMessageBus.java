package org.example.chapter08;

public interface IMessageBus {
    void sendEmailChangedMessage(int userId, String newEmail);
}
