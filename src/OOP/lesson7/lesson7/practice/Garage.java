package OOP.lesson7.lesson7.practice;

public class Garage {
    Car car1;
    Car car2;

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }
    public void getInfo(){
        getInfoAboutCar(car1);
        getInfoAboutCar(car2);
    }
    public void getInfoAboutCar(Car car){
        System.out.print(car.getModel() + ' ');
        car.accelerate();
    }
}
