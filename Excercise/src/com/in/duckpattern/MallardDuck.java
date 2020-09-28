package com.in.duckpattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I am a Mallard Duck");
    }

}
