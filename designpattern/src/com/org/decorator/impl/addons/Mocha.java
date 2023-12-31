package com.org.decorator.impl.addons;

import com.org.decorator.Beverage;
import com.org.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private final double COST = 0.20;
    public Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost (){
        return beverage.cost() + COST;
    }
}
