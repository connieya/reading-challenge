package java_performance_tuning.story03;

public class StringBufferTest1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ABCED");
        StringBufferTest1 sbt = new StringBufferTest1();
        sbt.check(sb);
    }

    private void check(CharSequence cs) {
        StringBuilder sb = new StringBuilder(cs);
        System.out.println("sb.length = " +sb.length());
    }
}
