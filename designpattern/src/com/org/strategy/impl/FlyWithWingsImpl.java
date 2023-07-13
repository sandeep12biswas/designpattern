package com.org.strategy.impl;

import com.org.strategy.FlyBehavior;

public class FlyWithWingsImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
