package OOP.lesson7.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
            Car car = new Car("audi");
            Car car2 = new Car("bmw");

        System.out.println(car2.getCounterCars());
        Car.printInfoByCar();
        System.out.println(Car.BWM_INFO);
        System.out.println(Arrays.toString(Car.BRANDS_DESCRIPTION));
    }
}
