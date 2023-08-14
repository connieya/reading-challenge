package patten_factory_framework;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThisCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RaggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion() , new Mushroom() , new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPeperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
