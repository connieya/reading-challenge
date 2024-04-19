package org.example.chapter07.observer.refactor;

import org.example.chapter07.observer.Status;

public class FaultStatusSMSSender implements StatusObserver{
    @Override
    public void onAbnormalStatus(Status status) {
        if (status.isFault()){
            sendSMS(status);
        }
    }

    private void sendSMS(Status status) {
    }
}
