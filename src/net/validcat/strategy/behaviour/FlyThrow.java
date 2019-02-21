package net.validcat.strategy.behaviour;

public class FlyThrow implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Someone throw me and I'm flying");
    }
}
