package com.in.designpattern.ObserverDesignPattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {


    private float temparature;
    private float humidity;
    private float pressure;



    CurrentConditionDisplay(Subject wheatherData){
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature is : " + temparature);
        System.out.println("humidity is : " + humidity);
        System.out.println("pressure is : " + pressure);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
            this.temparature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
            display();
    }
}
