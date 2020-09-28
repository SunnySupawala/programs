package com.in.visitorpattern;

public class TaxVisitor implements Visitor {

    @Override
    public Double visit(Bike bike) {
        System.out.println("Entered in  Bike ");
        return bike.price * .18 +bike.price;
    }

    @Override
    public Double visit(Car car) {
        System.out.println("Entered in  Car ");
        return car.price * .32 +car.price;
    }

    @Override
    public Double visit(Health health) {
        System.out.println("Entered in  Health ");
        return health.price * .60 +health.price;
    }
}
