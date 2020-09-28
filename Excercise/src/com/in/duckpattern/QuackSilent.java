package com.in.duckpattern;

public class QuackSilent implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silent");
    }
}
