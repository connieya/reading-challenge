package java_performance_tuning.story03;

public class StringTest {
    public static void main(String[] args) {
        String strSQL = "";
        strSQL += "select * ";
        strSQL += "from ( ";
        strSQL += "select A_column, ";
        strSQL += "B_column , ";

        StringBuilder sb = new StringBuilder();
        sb.append(" select *");
        sb.append(" from ( ");
        sb.append(" select A_column , ");
        sb.append(" B_column , ");
    }
}
