package java_performance_tuning.story08.synchro;

public class ContributeStaticTest {
    public static void main(String[] args) {
        ContributorStatic[] crs = new ContributorStatic[10];
        for (int loop= 0; loop<10; loop++) {
            ContributionStatic group = new ContributionStatic();
            crs[loop] = new ContributorStatic(group, "Contributor "+loop);
        }

        for (int loop=0; loop<10; loop++) {
            crs[loop].start();
        }
    }
}
