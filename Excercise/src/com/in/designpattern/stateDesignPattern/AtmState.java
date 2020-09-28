package com.in.designpattern.stateDesignPattern;

public interface AtmState {
    void insertCard();
    void ejectCard();
    void insertPin(int pinCode);
    void requestCash(int cashToWithdraw);

}
