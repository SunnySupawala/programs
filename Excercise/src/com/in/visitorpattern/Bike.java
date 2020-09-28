package com.in.visitorpattern;

public class Bike implements Visitable{

    public Double price;

    Bike(double item){
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
