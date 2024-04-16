package org.example.chapter06;

public class Main {
    public static void main(String[] args) {
       // 의존 객체
        FileJobQueue jobQueue = new FileJobQueue();
        FfmpegTransCoder transCoder = new FfmpegTransCoder();

        // 서비스 로케이터 초기화
        ServiceLocator locator = new ServiceLocator(jobQueue,transCoder);
        ServiceLocator.load(locator);

        // 어플리케이션 코드 실행
        Worker worker = new Worker();
        JobCLI jobcli = new JobCLI();
        jobcli.interact();

    }
}
