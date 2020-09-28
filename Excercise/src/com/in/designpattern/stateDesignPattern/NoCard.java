package com.in.designpattern.stateDesignPattern;

public class NoCard implements AtmState {

    ATMMachine atmMachine;

    NoCard(ATMMachine newAtmMachine){
        this.atmMachine = newAtmMachine;
    }


    @Override
    public void insertCard() {
        System.out.println("Please Enter a pin ");
        atmMachine.setAtmState(atmMachine.getYesCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first ");
    }

    @Override
    public void insertPin(int pinCode) {
        System.out.println("Enter a card first ");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first ");

    }
}
