package org.example.chapter07.observer;

public class StatusChecker {
    private EmailSender emailSender;

    public void check() {
        Status status = loadStatus();
        if (status.isNotNormal()){
            emailSender.sendEmail(status);
        }
    }

    private Status loadStatus() {
        return null;
    }
}
