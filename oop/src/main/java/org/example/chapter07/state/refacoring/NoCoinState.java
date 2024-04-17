package org.example.chapter07.state.refacoring;


public class NoCoinState implements State {
    @Override
    public void increaseCoin(int coin, VendingMachine vm) {
        vm.increaseCoin(coin);
        vm.changeState(new SelectableState());
    }

    @Override
    public void select(int productId, VendingMachine vm) {
        SoundUtil.beep();
    }
}
