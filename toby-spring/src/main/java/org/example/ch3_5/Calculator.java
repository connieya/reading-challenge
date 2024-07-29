package src.main.java.org.example.ch3_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public Integer calcSum(String filePath) {
        LineCallback sumCallback =
                new LineCallback() {
                    @Override
                    public Integer doSomethingWithLine(String line, Integer value) {
                        return value + Integer.parseInt(line);
                    }
                };
        return lineReadTemplate(filePath, sumCallback , 0);
    }

    public Integer calcMultiply(String filePath) {
        LineCallback multiplyCallback =
                new LineCallback() {
                    @Override
                    public Integer doSomethingWithLine(String line, Integer value) {
                        return value + Integer.parseInt(line);
                    }
                };
        return lineReadTemplate(filePath, multiplyCallback , 1);
    }

    private Integer lineReadTemplate(String filePath, LineCallback callback, int initVal) {
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
            System.out.println();
        }finally {
            System.out.println();
        }
    }
    }
}
