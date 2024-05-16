package springbook.user.ch15.ch3_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

//    public Integer calcSum(String filePath) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(filePath));
//        Integer sum = 0;
//        String line = null;
//        while ( (line = br.readLine()) != null) {
//            sum += Integer.valueOf(line);
//        }
//        br.close();
//        return sum;
//    }
    public Integer calcSum(String filePath) throws IOException {
       BufferedReaderCallback sumCallback =
                new BufferedReaderCallback() {
                    @Override
                    public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                        Integer sum = 0;
                        String line= null;
                        while ((line = br.readLine()) != null){
                            sum += Integer.valueOf(line);
                        }
                        return sum;
                    }
                };
                return fileReadTemplate(filePath,sumCallback);
    }

    public Integer fileReadTemplate(String filePath, BufferedReaderCallback callback) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            int ret = callback.doSomethingWithReader(br);
            return ret;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;

        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
