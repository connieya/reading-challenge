package pattern_singleton;

public class Singleton {
    // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    private static Singleton uniqueInstance;

    // 기타 인스턴스 변수


    // 생성자를 private으로 선언했으므로 Singleton 에서만 클래스의 인스턴스를 만들 수 있다.
    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
