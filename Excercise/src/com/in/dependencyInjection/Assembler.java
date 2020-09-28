package com.in.dependencyInjection;

public class Assembler {

    Payment getPaymentObject(){
        SavingAccount savingAccount = new SavingAccount();

        Payment payment = new Payment();
        //Setter Injection
        payment.setSavingAccount(savingAccount);
        return payment;


    }
}
