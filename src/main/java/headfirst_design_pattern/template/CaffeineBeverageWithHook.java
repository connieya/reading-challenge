package headfirst_design_pattern.template;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    private void boilWater() {
    }

    private void pourInCup() {

    }

    boolean customerWantsCondiments() {
        return true;
    }
}
