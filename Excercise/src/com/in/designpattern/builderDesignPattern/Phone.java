package com.in.designpattern.builderDesignPattern;

public class Phone {

    private String model;
    private String ram;
    private String os;
    private String processor;

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

    public Phone(String model, String ram, String os, String processor) {
        this.model = model;
        this.ram = ram;
        this.os = os;
        this.processor = processor;
    }
}
