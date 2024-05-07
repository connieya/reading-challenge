package org.example.chapter09;

public interface IMessageBus {
    void sendEmailChangedMessage(int userId, String newEmail);
}
