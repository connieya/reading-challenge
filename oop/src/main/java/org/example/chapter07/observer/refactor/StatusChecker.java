package org.example.chapter07.observer.refactor;

import org.example.chapter07.observer.EmailSender;
import org.example.chapter07.observer.Status;

public class StatusChecker extends StatusSubject {


    public void check() {
        Status status = loadStatus();
        if (status.isNotNormal()){
           super.notifyStatus(status);
        }
    }

    private Status loadStatus() {
        return null;
    }

    public boolean isContinuousFault() {
        return false;
    }
}
