package com.in.designpattern.stateDesignPattern;

public class NoCash implements AtmState{

    ATMMachine atmMachine;

    NoCash(ATMMachine newAtmMachine){
        this.atmMachine = newAtmMachine;

    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money, we din't insert a card");
    }

    @Override
    public void insertPin(int pinCode) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have money");

    }
}
