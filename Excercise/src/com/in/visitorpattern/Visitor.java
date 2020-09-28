package com.in.visitorpattern;

public interface Visitor {

   Double visit(Bike bike);
   Double visit(Car car);
   Double visit(Health health);

}
