package com.org.strategy.impl;

import com.org.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quak() {
        System.out.println("<<Silence>>");
    }
}
