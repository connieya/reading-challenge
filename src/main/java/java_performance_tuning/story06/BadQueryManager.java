package java_performance_tuning.story06;


import java.io.FileReader;
import java.util.HashMap;

public class BadQueryManager {
    private static String queryURL = null;

    public BadQueryManager(String badUrl) {
        queryURL = badUrl;
    }

    public static String getSql(String idSql) {
        try {
//            FileReader reader = new FileReader();
//            HashMap<String ,String > document = reader.read(queryURL);
        }catch (Exception ex){
            System.out.println(ex);
        }
        return null;
    }
}
