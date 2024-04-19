package org.example.chapter07.observer.refactor;

import org.example.chapter07.observer.Status;

public interface StatusObserver {
    void onAbnormalStatus(Status status);
}
