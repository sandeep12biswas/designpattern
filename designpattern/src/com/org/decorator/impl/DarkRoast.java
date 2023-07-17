package com.org.decorator.impl;

import com.org.decorator.Beverage;
import com.org.decorator.CondimentDecorator;

public class DarkRoast extends Beverage {
    private final double COST = 2.99;
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return COST;
    }
}
