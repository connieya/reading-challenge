package org.example.chapter06.locator;

import org.example.chapter06.JobQueue;

public class JobQueueLocator {
    private JobQueue jobQueue;

    public void setJobQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    public JobQueue getJobQueue() {
        return jobQueue;
    }

    private static JobQueueLocator instance;
    public static void load(JobQueueLocator locator) {
        JobQueueLocator.instance = locator;
    }

    public static JobQueueLocator getInstance() {
        return instance;
    }
}


