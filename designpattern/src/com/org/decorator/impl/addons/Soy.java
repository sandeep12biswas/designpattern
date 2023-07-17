package com.org.decorator.impl.addons;

import com.org.decorator.Beverage;
import com.org.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private final double COST = 0.15;
    private Beverage beverage;
    public Soy (Beverage  beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.description + ", Soy";
    }

    public double cost (){
        return beverage.cost() + COST;
    }
}
