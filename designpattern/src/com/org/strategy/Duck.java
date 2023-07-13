package com.org.strategy;

public interface Duck {

    public void display();
    public void performFly();
    public void performQuack();

    /**
     *  New setter method is added to add behavior at runtime
     */

    public void setFlyBehavior(FlyBehavior flyBehavior);
    public void setQuackBehavior(QuackBehavior quackBehavior);



}
