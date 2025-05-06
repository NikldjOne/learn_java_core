package OOP.lesson7.lesson7.Cat;


import java.util.Arrays;

public class Cat {
    private String color;
    private double weight;
    private String ownerName;

    public Cat(String colorName, double weightCat, String ownerNameCat) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = ownerNameCat;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n",sofaOwner);
    }
    public String hunt (boolean isDay){
        if(isDay){
        return "Мышь.";
        } else {
            return  "Сова";
        }
    }
    public String hunt(boolean isDay, boolean success){
        if(success){
            if(isDay){
                return "Мышь.";
            } else {
                return  "Сова";
            }
        }
        return "Ничего";
    }
    public void hunt(String time){
        if(time.equals("Утро")){
            System.out.println("Мышь");
        }else{
        System.out.println("Комар");

        }
    }
    public void feed(String giver, String ...product){
        System.out.printf("Человек %s дает еду. Кот поел: %s\n",giver, Arrays.toString(product));
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
