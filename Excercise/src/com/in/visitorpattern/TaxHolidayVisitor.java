package com.in.visitorpattern;

public class TaxHolidayVisitor implements Visitor {
    @Override
    public Double visit(Bike bike) {
        System.out.println("Entered in  Bike ");
        return bike.price * .5 +bike.price;
    }

    @Override
    public Double visit(Car car) {
        System.out.println("Entered in  Car ");
        return car.price * .8 +car.price;
    }

    @Override
    public Double visit(Health health) {
        System.out.println("Entered in  Health ");
        return health.price * .12 +health.price;
    }
}
