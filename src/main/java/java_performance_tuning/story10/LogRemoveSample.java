package java_performance_tuning.story10;

import java.util.ArrayList;

public class LogRemoveSample {
    private final boolean printFlag = false;

    public LogRemoveSample() {
    }

    public ArrayList getList() {
        ArrayList retList = new ArrayList<>(10);
        if (printFlag) {
            System.out.format("LogRemoveSample.getList():size=%d\n", retList.size());
        }
        return retList;
    }
}
