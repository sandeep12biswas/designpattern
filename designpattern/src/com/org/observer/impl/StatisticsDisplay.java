package com.org.observer.impl;

import com.org.observer.DisplayElement;
import com.org.observer.Observer;
import com.org.observer.Subject;

public class StatisticsDisplay  implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData=weatherData;
    }
    @Override
    public void display() {
        System.out.println(String.format("Statistics Condition : {} F degree and humidity % {}", temperature,humidity));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
