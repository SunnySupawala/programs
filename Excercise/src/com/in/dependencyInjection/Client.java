package com.in.dependencyInjection;

public class Client {

    public static void main(String[] args) {
        Assembler assembler = new Assembler();
        assembler.getPaymentObject().pay();
    }
}
