package com.in.designpattern.builderDesignPattern;

public class PhoneBuilder {

    private String model;
    private String ram;
    private String os;
    private String processor;

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(model, ram, os, processor);
    }
}
