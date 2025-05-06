package OOP.lesson7.lesson7.practice;

public class Practice {
    public static void main(String[] args) {
        Car car1 = new Car("Zvorikin car");
        Car car2 = new Car("SuperCar", 400);
        Garage garage = new Garage();
        garage.setCar1(car1);
        garage.setCar2(car2);
        garage.getInfo();
    }
}
