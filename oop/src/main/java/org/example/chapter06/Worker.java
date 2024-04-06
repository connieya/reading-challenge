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

        // 작성 , 콘크리트 클래스를 사용
        JobQueue jobQueue = new FileJobQueue(); // DIP 위반
    }
}
