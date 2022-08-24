package model;

import model.interfaces.*;

public class Eagle  implements IEat, IFly, IHunt, IAnimal, ISleep {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   @Override
    public void hunt() {
        System.out.println("Eagle is hunting");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
@Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void animal(){
        System.out.println("Animals enter the cage");
    }
}
