package net.validcat.strategy.behaviour;

public class NoFly implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Sorry, I can't fly");
    }
}
