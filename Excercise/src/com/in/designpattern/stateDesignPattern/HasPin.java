package com.in.designpattern.stateDesignPattern;

public class HasPin implements AtmState{

    ATMMachine atmMachine;

    HasPin(ATMMachine newAtmMachine){
        this.atmMachine = newAtmMachine;
    }


    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card ");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinCode) {
        System.out.println("Already Entered Pin");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine){
            System.out.println("Don't have sufficient balance");
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }else {
            System.out.println(cashToWithdraw +" is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0){
                atmMachine.setAtmState(atmMachine.getAtmOutOfMachine());
            }
        }
    }
}
