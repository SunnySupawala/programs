package com.in.duckpattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking like Quack ");
    }
}
