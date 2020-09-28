package com.in.dependencyInjection;

public class Payment {

    SavingAccount savingAccount;

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void pay(){
        System.out.println("Client payment");

    }
}
