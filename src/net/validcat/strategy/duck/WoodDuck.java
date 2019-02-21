package net.validcat.strategy.duck;

import net.validcat.strategy.behaviour.IFlyBehaviour;

public class WoodDuck extends AbsDuck {

    public WoodDuck(IFlyBehaviour behaviour) {
        super(behaviour);
    }

    @Override
    public void display() {
        System.out.println("This is WoodDuck");
    }
}
