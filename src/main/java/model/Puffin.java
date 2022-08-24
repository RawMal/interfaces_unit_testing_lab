package model;

import model.interfaces.*;

public class Puffin implements IAnimal, IFly, ISwim, IPrey, IEat, ISleep {
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }

    @Override
    public void animal(){
        System.out.println("Animals enter the cage");
    }
}
