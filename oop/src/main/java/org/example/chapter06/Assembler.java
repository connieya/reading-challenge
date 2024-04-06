package org.example.chapter06;

public class Assembler {
    private Worker worker;
    private JobCLI jobCLI;

    public void createAndWire(){
        JobQueue jobQueue = new FileJobQueue();
        Transcoder transcoder = new FfmpegTransCoder();

        this.worker = new Worker(jobQueue,transcoder);

        this.worker = new Worker();
        // 설정 메서드로 의존 객체 받음
        this.worker.setJobQueue(jobQueue);
        this.worker.setTranscoder(transcoder);

        // 생성자로 의존 객체 받음
        this.jobCLI = new JobCLI(jobQueue);
    }

    public Worker getWorker() {
        return worker;
    }

    public JobCLI getJobCLI() {
        return jobCLI;
    }
}
