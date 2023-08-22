package headfirst_design_pattern.patten_factory;

public class Application {
    public static void main(String[] args) {

        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("Veggie");

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("Veggie");
    }
}
