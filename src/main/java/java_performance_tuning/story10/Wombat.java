package java_performance_tuning.story10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wombat {
    final Logger logger = LoggerFactory.getLogger(Wombat.class);
    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {} . Old temperature  was {}.", t, oldT);
        if (temperature.intValue() > 50) {
            logger.info("Temperature has risen above 50 degrees . ");
        }

        try {

        }catch (Exception e) {
            StackTraceElement[] ste = e.getStackTrace();
            String className = ste[0].getClassName();
            String methodName = ste[0].getMethodName();
            int lineNumber = ste[0].getLineNumber();
            String fileName = ste[0].getFileName();

        }
    }
}


