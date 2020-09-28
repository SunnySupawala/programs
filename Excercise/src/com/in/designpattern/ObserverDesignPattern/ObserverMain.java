package com.in.designpattern.ObserverDesignPattern;

public class ObserverMain {

    public static void main(String[] args) {
        WeatherData wheatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(wheatherData);
        currentConditionDisplay.update(1f,2f,3f);

        wheatherData.setMeasurement(5f,3f,1f);
        wheatherData.setMeasurement(5f,3f,3f);
        wheatherData.setMeasurement(5f,3f,2f);





    }
}
