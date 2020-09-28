package com.in.designpattern.inbuiltobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentContionDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    CurrentContionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
            if(o instanceof WeatherData){
                WeatherData weatherData = (WeatherData) o;
               this.humidity =  weatherData.getHumidity();
               this.temperature = weatherData.getTemperature();
               this.pressure = weatherData.getPressure();
               display();
            }
    }

    @Override
    public void display() {
        System.out.println("temperature is : " + temperature);
        System.out.println("humidity is : " + humidity);
        System.out.println("pressure is : " + pressure);
    }
}
