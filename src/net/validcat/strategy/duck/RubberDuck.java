package net.validcat.strategy.duck;

import net.validcat.strategy.behaviour.IFlyBehaviour;

public class RubberDuck extends AbsDuck {

    public RubberDuck(IFlyBehaviour behaviour) {
        super(behaviour);
    }

    @Override
    public void display() {
        System.out.println("This is RubberDuck");
    }
}
