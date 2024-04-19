package org.example.chapter07.observer.refactor;

import org.example.chapter07.observer.Status;

public class StatusEmailSender implements StatusObserver {
    @Override
    public void onAbnormalStatus(Status status) {
        sendEmail(status);
    }

    private void sendEmail(Status status) {

    }
}
