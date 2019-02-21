package net.validcat.strategy.duck;

import net.validcat.strategy.behaviour.IFlyBehaviour;

public class RedHeadDuck extends AbsDuck {

    public RedHeadDuck(IFlyBehaviour behaviour) {
        super(behaviour);
    }

    @Override
    public void display() {
        System.out.println("This is RedHeadDuck");
    }

}