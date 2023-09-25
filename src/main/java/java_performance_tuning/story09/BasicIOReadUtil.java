package java_performance_tuning.story09;

import java.io.FileReader;
import java.util.ArrayList;

public class BasicIOReadUtil {
    public static ArrayList readCharStream(String fileName) throws Exception {
        ArrayList<StringBuffer> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            int data=0;
            StringBuffer sb =new StringBuffer();
            while ((data = fr.read()) != -1){
                if (data == '\n' || data =='r'){
                    list.add(sb);
                    sb = new StringBuffer();
                }else {
                    sb.append((char)data);
                }
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }finally {
            if (fr != null) fr.close();;
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        String fileName= "C:\\10MBFile";
        StopWatch  sw = new StopWatch();
        sw.start();
        ArrayList list1 = BasicIOReadUtil.readCharStream(fileName);
        System.out.println(sw);
        System.out.println(list1.size());
    }

    public static String readCharStreamWithBuffer(String fileName) {
        return null;
    }
}
