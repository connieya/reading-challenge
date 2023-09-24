package java_performance_tuning.story09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Basic {
    public static ArrayList readCharStream(String fileName) throws Exception{
        ArrayList<StringBuffer> list = new ArrayList();

        return list;
    }

    public static String readStreamWithBuffer(String fileName) throws IOException {
        StringBuffer retSB = new StringBuffer();
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            int bufferSize = 1024*1024;
            char readBuffer[] = new char[bufferSize];
            int resultSize = 0;
            while ((resultSize = fr.read(readBuffer)) != -1) {
                if (resultSize == bufferSize) {
                    retSB.append(readBuffer);
                }else {
                    for (int loop =0; loop < resultSize; loop++) {
                        retSB.append(readBuffer[loop]);
                    }
                }
            }
        }catch (Exception e) {
            ;
        }
        return retSB.toString();
    }
}
