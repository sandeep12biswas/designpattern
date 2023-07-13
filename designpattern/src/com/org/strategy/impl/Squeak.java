package com.org.strategy.impl;

import com.org.strategy.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quak() {
        System.out.println("Squeak");
    }
}
