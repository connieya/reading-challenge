package java_performance_tuning.story07;

public class DemoTest {
    public static void main(String[] args) {
        DemoClass dc = new DemoClass();

        DemoTest dt = new DemoTest();
        dt.getClassInfos(dc);
    }

    private void getClassInfos(Object clazz) {
        Class demoClass = clazz.getClass();
        getClassInfo(demoClass);
    }

    private void getClassInfo(Class demoClass) {
        String className = demoClass.getName();
        System.out.format("Class Name :  %s\n",className);

        String classCanonicalName = demoClass.getCanonicalName();
        System.out.format("Class Canonical Name : %s \n",classCanonicalName);
        String classSimpleName = demoClass.getSimpleName();
        System.out.format("Class Simple Name : %s\n",classSimpleName);
    }
}
