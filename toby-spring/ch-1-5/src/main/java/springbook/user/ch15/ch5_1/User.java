package springbook.user.ch15.ch5_1;

public class User {
    private static final int BASIC = 1;
    private static final int SILVER = 2;
    private static final int GOLD = 3;

    int level;

    public void setLevel(int level) {
        this.level = level;
    }
}
