package com.in.visitorpattern;

public class Car implements Visitable{

    public Double price;

    Car(Double item){
        this.price = item;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
