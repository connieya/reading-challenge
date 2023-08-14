package patten_factory_framework;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPeperoni();

    Clams createClam();
}
