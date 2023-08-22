package headfirst_design_pattern.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n 오리가 말하길");
        testDuck(duck);

        System.out.println("\n 칠면조 어뎁터가 말하길");
        testDuck(turkeyAdapter);
    }

     static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
