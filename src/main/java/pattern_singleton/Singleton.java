package pattern_singleton;

public class Singleton {
    // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    private static  Singleton instance;


    private Singleton() {}

    public static  Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
