package com.org.decorator.impl;

import com.org.decorator.Beverage;

public class Espresso extends Beverage {

    private final double ESPRESSO_COST = 1.99;
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return ESPRESSO_COST;
    }
}
