package com.in.visitorpattern;

public class VisitorTest {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Bike bike = new Bike(100000);
        Car car = new Car(20000.0);
        Health health = new Health(40000);

        System.out.println(bike.accept(taxVisitor)+"\n");
        System.out.println(car.accept(taxVisitor)+"\n");
        System.out.println(health.accept(taxVisitor)+"\n");



        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        bike.accept(taxHolidayVisitor);


    }
}
