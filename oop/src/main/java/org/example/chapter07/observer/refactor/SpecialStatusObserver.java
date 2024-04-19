package org.example.chapter07.observer.refactor;

import org.example.chapter07.observer.Status;

public class SpecialStatusObserver implements StatusObserver {

    private StatusChecker statusChecker;
    private Siren siren;

    public SpecialStatusObserver(StatusChecker statusChecker) {
        this.statusChecker = statusChecker;
    }

    @Override
    public void onAbnormalStatus(Status status) {
        if (status.isFault() && statusChecker.isContinuousFault()) {
            siren.begin();
        }
    }
}
