package net.validcat.strategy.duck;

import net.validcat.strategy.behaviour.IFlyBehaviour;

public class MallardDuck extends AbsDuck {

    public MallardDuck(IFlyBehaviour behaviour) {
        super(behaviour);
    }

    @Override
    public void display() {
        System.out.println("This is MallardDuck");
    }

}
