package com.in.duckpattern;

public class Duck {

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    public void flyBehaviour(){
        flyBehaviour.fly();
    }

    public void quackBehaviour(){
        quackBehavior.quack();
    }

    Duck(){

    }

     void swim(){
         System.out.println("All Duck will be swim");
     }

}
