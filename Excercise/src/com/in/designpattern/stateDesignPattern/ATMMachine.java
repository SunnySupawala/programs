package com.in.designpattern.stateDesignPattern;

public class ATMMachine {

    AtmState hasCard;
    AtmState noCard;
    AtmState hasCorrectPin;
    AtmState atmOutOfMoney;

    AtmState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }

    }

    void setAtmState(AtmState newAtmState){
        atmState = newAtmState;
    }
    public void setCashInMachine(int newCashInMachine){
        cashInMachine = newCashInMachine;
    }
    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }
    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }
    public void insertPin(int insertPin){
        atmState.insertPin(insertPin);
    }

     AtmState getYesCardState(){ return hasCard; }
     AtmState getNoCardState(){ return noCard; }
    AtmState getHasPin(){ return hasCorrectPin; }
     AtmState getAtmOutOfMachine(){ return atmOutOfMoney; }
}
