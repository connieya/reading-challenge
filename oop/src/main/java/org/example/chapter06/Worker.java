package org.example.chapter06;

public class Worker {
    public Worker() {
    }

    private JobQueue jobQueue;
    private Transcoder transcoder;

    public Worker(JobQueue jobQueue, Transcoder transcoder) {
        this.jobQueue = jobQueue;
        this.transcoder = transcoder;
    }

    public void setJobQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    public void setTranscoder(Transcoder transcoder) {
        this.transcoder = transcoder;
    }

    public void run() {
        // 서비스 로케이터 이용해서 의존 객체 구함
        ServiceLocator locator = ServiceLocator.getInstance();
        JobQueue jobQueue = locator.getJobQueue();
        Transcoder transcoder = locator.getTranscoder();

        // 의존 객체 사용


    }
}
