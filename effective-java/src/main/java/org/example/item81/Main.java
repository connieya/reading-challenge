package org.example.item81;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class Main {
    private static final ConcurrentMap<String, String> map =
            new ConcurrentHashMap<>();

    public static String intern(String s) {
        String result = map.get(s);
        if (result == null){
            result  = map.putIfAbsent(s,s);
            if (result == null)
                return s;
        }
        return result;
    }


    public static long time(Executor executor ,int concurrency , Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);

        CountDownLatch done = new CountDownLatch(concurrency);

        for (int i=0; i< concurrency; i++) {
            executor.execute(()-> {
                ready.countDown();
                try {
                    start.await();
                    action.run();
                }catch (InterruptedException e) {
                    Thread.currentThread().interrupt();;
                }finally {
                    done.countDown();
                }
            });
        }

        ready.await();
        long startNanos = System.nanoTime();
        start.countDown();
        done.await();
        return System.nanoTime() - startNanos;
    }
}
