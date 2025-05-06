package OOP.lesson7.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Vlad";

    {
        //Отрабатывает, когда создаем экземпляр
        System.out.println("Собака родилась!");
    }

    public Dog(){

    }
    public Dog(String name, String owner){
        this.name = name;
        this.owner = owner;
    }
    public void setWeight(int weight){
        if(weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
    }
    public String getOwner(){
        return "Mr." + this.owner;
    }
    public void feed(String giver, String ...product){
        System.out.printf("Человек %s дает еду. Dog поел: %s\n",giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
