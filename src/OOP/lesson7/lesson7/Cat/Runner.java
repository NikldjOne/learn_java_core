package OOP.lesson7.lesson7.Cat;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("black",10, "Petr");
//        System.out.println(cat.color);
//        System.out.println(cat.weight);
//        System.out.println(cat.ownerName);
//        cat.color = "Red";
        cat.destroySofa("Maksima");
        String hunt = cat.hunt(false);
        String resultHunt2 = cat.hunt(false,false);

        System.out.println(hunt);
        System.out.println(resultHunt2);
        cat.hunt("Утро");

        cat.feed("Nikita", "Meat","Milk","Water");
    }
}
