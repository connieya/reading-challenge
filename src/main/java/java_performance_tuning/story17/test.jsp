<%
    long mainTime = System.nanoTime();
    for (int outLoop = 0; outLoop < 10; outLoop++) {
        String aValue = "abcdefghijklmnopqrstuvwxyz";
        for (int loop=0; loop<10; loop++) {
            aValue += aValue;
        }
        System.gc();
    }
    double mainTimeElapsed = (System.nanoTime() - mainTime) /1000000.000;

%>