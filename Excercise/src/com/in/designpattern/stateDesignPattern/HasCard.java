package com.in.designpattern.stateDesignPattern;

public class HasCard implements AtmState{

    ATMMachine atmMachine;

    HasCard(ATMMachine newAtmMachine){
        this.atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't entered more then one card ");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinCode) {
        if(pinCode == 1020){
            System.out.println("correct Pin ");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }else {
            System.out.println("Incorrect Pin ");
            atmMachine.correctPinEntered = false;
            System.out.println("Card Ejected ");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Entered Pin first");

    }
}
