package com.org.decorator.impl.addons;

import com.org.decorator.Beverage;
import com.org.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private final double COST = 0.75;
    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost (){
        return beverage.cost() + COST;
    }
}
