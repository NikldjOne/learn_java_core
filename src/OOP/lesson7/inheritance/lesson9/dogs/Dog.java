package OOP.lesson7.inheritance.lesson9.dogs;

import OOP.lesson7.inheritance.lesson9.Alive;

public abstract class Dog  extends Alive {
    protected final int countsLegs = 4;
    public int countTeeth;
    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }
    public void beAngry(){
        System.out.println("Dog is angry");
    }

    public void bark(){
        System.out.println("Собака гавкает");
    }
    public final void eat() {
        System.out.println("Собака ест");
    }

    public abstract void run();
}
