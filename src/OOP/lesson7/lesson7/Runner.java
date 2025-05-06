package OOP.lesson7.lesson7;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Muhtar", "Vasya");
        dog.setWeight(10);;
        System.out.println(dog);
        System.out.println( dog.getOwner());
        Dog dog2 = new Dog();
        System.out.println(dog2);
    }
}
