package java_performance_tuning.story08;

public class RunThreads {
    public static void main(String[] args) {
        RunnableImpl ri = new RunnableImpl();
        ThreadExtends te = new ThreadExtends();
        new Thread(ri).start();
        te.start();
    }
}
