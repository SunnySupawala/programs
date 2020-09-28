package com.in.duckpattern;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This Duck can't fly");
    }
}
