package org.example.chapter07.state.refacoring;

public class SelectableState implements State {
    @Override
    public void increaseCoin(int coin, VendingMachine vm) {
        vm.increaseCoin(coin);
    }

    @Override
    public void select(int productId, VendingMachine vm) {
        vm.provideProduct(productId);
        vm.decreaseCoin();

        if (vm.hasNoCoin()){
            vm.changeState(new NoCoinState());
        }
    }
}
