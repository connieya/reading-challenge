package org.example.chapter06;

public class ServiceLocator {

    private JobQueue jobQueue;
    private Transcoder transcoder;

    public ServiceLocator(JobQueue jobQueue, Transcoder transcoder) {
        this.jobQueue = jobQueue;
        this.transcoder = transcoder;
    }


    public void setJobQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    public void setTranscoder(Transcoder transcoder) {
        this.transcoder = transcoder;
    }

    public Transcoder getTranscoder() {
        return transcoder;
    };
    public JobQueue getJobQueue() {
        return jobQueue;
    };

    public JobQueue getFileJobQueue() {
        return jobQueue;
    };

    public JobQueue getDbJobQueue() {
        return jobQueue;
    };

    private static ServiceLocator instance;
    public static void load(ServiceLocator locator) {
        ServiceLocator.instance = locator;
    }

    public static ServiceLocator getInstance() {
        return instance;
    }
}
