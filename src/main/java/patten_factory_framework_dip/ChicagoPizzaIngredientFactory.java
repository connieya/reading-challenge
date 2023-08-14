package patten_factory_framework_dip;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives() , new EggPlant() , new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPeperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FronzenClams();
    }
}
