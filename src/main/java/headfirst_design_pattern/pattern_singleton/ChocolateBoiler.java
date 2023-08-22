package headfirst_design_pattern.pattern_singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;


    private static ChocolateBoiler chocolateBoiler;
    public static ChocolateBoiler getInstance() {
        if(chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if(isEmpty()){
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            // 재료를 끓임
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
