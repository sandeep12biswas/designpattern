package com.org.strategy.impl;

import com.org.strategy.Duck;
import com.org.strategy.FlyBehavior;
import com.org.strategy.QuackBehavior;

public abstract class DuckImpl implements Duck {

    FlyBehavior flyBehavior = null;
    QuackBehavior quackBehavior = null;
    public DuckImpl (){

    }
    public void performFly (){
        flyBehavior.fly();
    }

    public void performQuack (){
        quackBehavior.quak();
    }

    @Override
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;

    }

    @Override
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim (){
        System.out.println("All ducks float, even decoys");
    }
}
