package org.example.chapter06.locator.generic;

import org.example.chapter06.JobQueue;

public class JobCLI {
    private JobQueue jobQueue;
    public JobCLI(JobQueue jobQueue) {
        // 생성자 방식은 객체 생성 시점에서 의존 객체가 완전한지 확인할 수 있다.
        if (jobQueue == null){
            throw  new IllegalArgumentException();
        }
        this.jobQueue = jobQueue;

    }

    public JobCLI() {
    }

    public void interact() {
        JobQueue jobQueue = ServiceLocator.get(JobQueue.class);
    }
}
