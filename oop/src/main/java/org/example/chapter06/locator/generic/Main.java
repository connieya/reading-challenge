package org.example.chapter06.locator.generic;

import org.example.chapter06.*;

public class Main {

    public static void main(String[] args) {
        ServiceLocator.regist(JobQueue.class, new FileJobQueue());
        ServiceLocator.regist(Transcoder.class, new FfmpegTransCoder());

        JobCLI jobCli = new JobCLI();
        jobCli.interact();
    }
}
