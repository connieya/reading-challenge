package java_performance_tuning.story08.synchro;

public class ContributionStatic {
    private static int amount = 0;
    public static synchronized void donate() {
        amount++;
    }

    public int getTotal(){
        return amount;
    }
}
