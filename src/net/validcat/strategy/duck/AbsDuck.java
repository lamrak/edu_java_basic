package net.validcat.strategy.duck;

import net.validcat.strategy.behaviour.IFlyBehaviour;

public abstract class AbsDuck {
    IFlyBehaviour flyBehaviour;

    public AbsDuck(IFlyBehaviour behaviour) {
        this.flyBehaviour = behaviour;
    }

    public void swim() {
        System.out.println("Sweeeeem");
    }

    public void quack() {
        System.out.println("Quack");
    }

    public abstract void display();

    public void fly() {
        flyBehaviour.fly();
    }

}
