package OOP.lesson7.inheritance.lesson9;

import OOP.lesson7.inheritance.lesson9.dogs.Poodle;
import OOP.lesson7.inheritance.lesson9.dogs.defend_dogs.Shepherd;
import OOP.lesson7.inheritance.lesson9.dogs.Terier;

public class Runner {
    public static void main(String[] args) {
        //Пудль
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breath();
        System.out.println(poodle.countTeeth);

        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        shepherd.beAngry();
        System.out.println(shepherd.countTeeth);

        Terier terier = new Terier();
        terier.bark();
        System.out.println(terier.countTeeth);


    }
}
