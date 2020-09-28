package com.in.designpattern.inbuiltobservable;

public class InbuiltObserverMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentContionDisplay currentContionDisplay = new CurrentContionDisplay(weatherData);
        weatherData.setMeasurement(1f,2f,3f);
        weatherData.setMeasurement(2f,3f,5f);
    }
}
