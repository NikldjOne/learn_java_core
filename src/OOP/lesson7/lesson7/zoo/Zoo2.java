package OOP.lesson7.lesson7.zoo;

import OOP.lesson7.lesson7.Cat.Cat;
import OOP.lesson7.lesson7.Dog;

public class Zoo2 {
    private Cat cat;
    private Dog dog;

    public Zoo2(Cat cat, Dog dog) {
        if(cat == null){
            this.cat = new Cat("black", 20, "Petr");
        }else{
        this.cat = cat;
        }
        this.dog = dog;
    }
    public void feed(){
        cat.feed("Vasya","Fish");
        dog.feed("Vasya","Meat");
    }
}
