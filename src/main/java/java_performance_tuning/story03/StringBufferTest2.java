package java_performance_tuning.story03;

public class StringBufferTest2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("ABCED");
        sb.append("FGHIHJ");
        sb.append("KLMNO");

        sb.append("DD")
                .append("DAA")
                .append("SWW");

        // 하지만 제발 이렇게는 사용하지 말기 바란다.
        sb.append("ABCDE + " +"="+"FGGG");
        sb.insert(3,"123");
        System.out.println(sb);
    }
}
