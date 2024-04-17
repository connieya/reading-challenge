package org.example.chapter07.state.refacoring;


public interface State {
    void increaseCoin(int coin , VendingMachine vm);
    void select(int productId , VendingMachine vm);
}
