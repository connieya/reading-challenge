package org.example.chapter06.locator;

import org.example.chapter06.JobQueue;
import org.example.chapter06.Transcoder;

public abstract class ServiceLocator {

    public abstract JobQueue getJobQueue();
    public abstract Transcoder getTranscoder();

    protected ServiceLocator() {
        ServiceLocator.instance = this;
    }

    private static ServiceLocator instance;
    public static ServiceLocator getInstance() {
        return instance;
    }
}
