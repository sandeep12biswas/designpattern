package com.org.strategy.impl;

public class MallardDuck extends DuckImpl{
        public MallardDuck(){
            flyBehavior = new FlyWithWingsImpl();
            quackBehavior = new QuackBehaviorImpl();
        }
    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
