package com.in.duckpattern;

public class StimulaterMiniDuck  {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.flyBehaviour();
        mallardDuck.quackBehaviour();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.setFlyBehaviour(new RocketFly());
        modelDuck.flyBehaviour();
        modelDuck.quackBehaviour();
    }

}
