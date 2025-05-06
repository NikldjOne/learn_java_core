package OOP.lesson7.lesson7.zoo;

import OOP.lesson7.lesson7.Cat.Cat;
import OOP.lesson7.lesson7.Dog;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog("Muhtar", "Vasya");
        dog.setWeight(10);
        Cat cat = new Cat("black", 20, "Petr");
        Zoo2 zoo2 = new Zoo2(null,dog);
        zoo2.feed();
    }
}
