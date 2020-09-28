package com.in.designpattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> listObserver ;
    private float humidity;
    private float temperature;
    private float pressure;

    WeatherData(){
        listObserver = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        listObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(listObserver.indexOf(observer) >= 0) {
            listObserver.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        listObserver.forEach(observer -> observer.update(temperature, humidity, pressure));
    }


    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();

    }

}
