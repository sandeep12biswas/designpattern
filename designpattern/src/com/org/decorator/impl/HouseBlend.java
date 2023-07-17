package com.org.decorator.impl;

import com.org.decorator.Beverage;

public class HouseBlend extends Beverage {

    private final double COST = 0.89;

    public HouseBlend (){
        description = "House blend coffee";
    }
    @Override
    public double cost() {
        return COST;
    }
}
