package headfirst_design_pattern.patten_factory_framework_dip;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPeperoni();

    Clams createClam();
}
