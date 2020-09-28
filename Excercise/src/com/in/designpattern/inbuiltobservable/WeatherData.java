package com.in.designpattern.inbuiltobservable;

import java.util.Observable;

public class WeatherData  extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
