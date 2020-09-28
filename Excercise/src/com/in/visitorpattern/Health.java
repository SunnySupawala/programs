package com.in.visitorpattern;

public class Health implements Visitable{

    Double price;
    Health(double item){
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
