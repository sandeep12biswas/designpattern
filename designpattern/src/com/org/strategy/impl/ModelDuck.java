package com.org.strategy.impl;

public class ModelDuck extends DuckImpl{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
