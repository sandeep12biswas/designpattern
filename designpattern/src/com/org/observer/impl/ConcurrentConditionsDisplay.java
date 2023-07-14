package com.org.observer.impl;

import com.org.observer.DisplayElement;
import com.org.observer.Observer;
import com.org.observer.Subject;

public class ConcurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ConcurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

     @Override
    public void display() {
        System.out.println("Current Condition : " + temperature + " F degree and humidity % "+ humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
