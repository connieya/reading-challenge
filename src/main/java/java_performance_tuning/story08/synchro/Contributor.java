package java_performance_tuning.story08.synchro;

public class Contributor extends Thread{
    private Contribution myContribution;
    private String myName;

    public Contributor(Contribution contribution , String  name) {
        myContribution = contribution;
        myName = name;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 1000; loop++) {
            myContribution.donate();
        }
        System.out.format("%s total = %d\n",myName,myContribution.getTotal());
    }
}
