package org.example.chapter07.state;

public class VendingMachine {

    public static enum State {
        NOCOIN , SELECTABLE , SOLDOUT
    }

    private State state = State.NOCOIN;

    public void insertCoin(int coin) {
        switch (state){
            case NOCOIN:
                increaseCoin(coin);
                state = State.SELECTABLE;
                break;
            case SELECTABLE:
                increaseCoin(coin);
            case SOLDOUT:
                returnCoin();
        }
    }

    private void returnCoin() {
    }


    public void select(int productId) {
        switch (state) {
            case NOCOIN:
                break;
            case SELECTABLE:
                provideProduct(productId);
                decreaseCoin();
                if (hasNoCoin()){
                    state = State.NOCOIN;
                }
        }
    }

    private boolean hasNoCoin() {
        return false;
    }

    private void provideProduct(int productId) {
    }

    private void decreaseCoin() {

    }

    private void increaseCoin(int coin) {
    }
}
