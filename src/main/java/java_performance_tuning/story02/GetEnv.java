package java_performance_tuning.story02;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetEnv {
    public static void main(String[] args) {
        Map<String ,String> envMap = System.getenv();
        Set key =  envMap.keySet();
        Iterator it = key.iterator();
        while (it.hasNext()) {
            String curKey = it.next().toString();
            System.out.format("%s = %s \n", curKey, envMap.get(curKey));
        }
    }
}
