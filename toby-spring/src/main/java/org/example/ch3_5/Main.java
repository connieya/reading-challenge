package src.main.java.org.example.ch3_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public Integer lineReadTemplate(String filePath, LineCallback callback , int initVal) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            Integer res = initVal;
            String line = null;
            while ((line = br.readLine()) != null){
                res = callback.doSomethingWithLine(line,res);
            }
            return  res;
        }catch (IOException e){

        }finally {
            System.out.println();
        }
        return null;
    }
}
