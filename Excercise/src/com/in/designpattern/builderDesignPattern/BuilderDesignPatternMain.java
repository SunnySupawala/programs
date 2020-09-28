package com.in.designpattern.builderDesignPattern;

public class BuilderDesignPatternMain {

    public static void main(String[] args) {


        Phone phone = new PhoneBuilder().setModel("sdsdsdsf").setOs("MacOS").setRam("snapDragon").getPhone();


    }
}
