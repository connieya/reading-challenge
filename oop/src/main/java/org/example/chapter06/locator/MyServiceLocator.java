package org.example.chapter06.locator;

import org.example.chapter06.FfmpegTransCoder;
import org.example.chapter06.FileJobQueue;
import org.example.chapter06.JobQueue;
import org.example.chapter06.Transcoder;

public class MyServiceLocator extends ServiceLocator{
    private FileJobQueue jobQueue;
    private FfmpegTransCoder transCoder;

    public MyServiceLocator() {
        super();
        this.jobQueue = new FileJobQueue();
        this.transCoder = new FfmpegTransCoder();
    }

    @Override
    public JobQueue getJobQueue() {
        return jobQueue;
    }

    @Override
    public Transcoder getTranscoder() {
        return transCoder;
    }
}
