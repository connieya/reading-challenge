package patten_factory_framework_dip;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic() , new Onion(), new Mushroom() , new RedPepper()};
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
