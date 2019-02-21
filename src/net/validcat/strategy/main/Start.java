package net.validcat.strategy.main;

import net.validcat.strategy.behaviour.Fly;
import net.validcat.strategy.behaviour.FlyThrow;
import net.validcat.strategy.behaviour.IFlyBehaviour;
import net.validcat.strategy.behaviour.NoFly;
import net.validcat.strategy.duck.*;

public class Start {

    public static void main(String[] args) {
        IFlyBehaviour fly = new Fly();
        IFlyBehaviour noFly = new NoFly();

        AbsDuck redHead = new RedHeadDuck(fly);
        AbsDuck mallard = new MallardDuck(fly);

        AbsDuck wood = new WoodDuck(new FlyThrow());
        AbsDuck rubber = new RubberDuck(noFly);

        System.out.println("RedHeadDuck");
        redHead.quack();
        redHead.swim();
        redHead.fly();
        redHead.display();
        System.out.println();

        System.out.println("MallardDuck");
        mallard.quack();
        mallard.swim();
        mallard.fly();
        mallard.display();
        System.out.println();

        System.out.println("WoodDuck");
        wood.quack();
        wood.swim();
        wood.fly();
        wood.display();
        System.out.println();

        System.out.println("RubberDuck");
        rubber.quack();
        rubber.swim();
        rubber.fly();
        rubber.display();
        System.out.println();
    }
}
