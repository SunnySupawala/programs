package com.in.duckpattern;

public class ModelDuck extends Duck {

    ModelDuck(){
        flyBehaviour = new NoFly();
        quackBehavior = new QuackSilent();
    }
}
