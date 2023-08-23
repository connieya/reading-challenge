package java_performance_tuning.story02;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareTimer {
    public static void main(String[] args) {
        CompareTimer timer = new CompareTimer();
        for (int loop = 0; loop < 10; loop++) {
            timer.checkNanoTime();
            timer.checkCurrentTimeMillis();
        }
    }

    private DummyData dummy;

    private void checkCurrentTimeMillis() {
        long startTime = System.currentTimeMillis();
        dummy = timeMakeObjects();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("milli = " + elapsedTime);
    }

    private DummyData timeMakeObjects() {
        HashMap<String, String> map = new HashMap<>(10000000);
        ArrayList<String > list = new ArrayList<>(10000000);
        return new DummyData(map,list);
    }


    private void checkNanoTime() {
        long startTime = System.nanoTime();
        dummy =  timeMakeObjects();
        long endTIme = System.nanoTime();
        double elapsedTime =  (endTIme-startTime) / 10000000.0;
        System.out.println("nanoe ="+elapsedTime);
    }
}
