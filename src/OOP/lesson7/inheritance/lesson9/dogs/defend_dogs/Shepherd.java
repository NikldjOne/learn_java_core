package OOP.lesson7.inheritance.lesson9.dogs.defend_dogs;

import OOP.lesson7.inheritance.lesson9.dogs.Dog;

public class Shepherd extends Dog {

    public Shepherd() {
        super(32);
    }

    @Override
    public void run() {
        System.out.println("dog fast");
    }

    @Override
    public void breath() {
        System.out.println("shepherd breath");
    }

    @Override
    public void bark(){
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void beAngry(){
        System.out.printf("У нашей собаки %s", super.countsLegs);
        System.out.println("");
        System.out.println("Овчарка увидела другого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
