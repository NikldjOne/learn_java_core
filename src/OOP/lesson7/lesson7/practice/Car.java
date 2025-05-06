package OOP.lesson7.lesson7.practice;

public class Car {
    private String model = "Audi";
    private int maxSpeed = 220;

    public Car(String model, int maxSpeed){
    this.model = model;
    this.maxSpeed = maxSpeed;
    }

    public Car(String model){
    this.model = model;
    }

    public String getModel(){
        return this.model;
    }
    public void  accelerate(){
        double speed =  110d / ( this.maxSpeed / 20d);
        System.out.printf("Скорость разгона до 100 км/ч : [%s]\n", speed);
    }
}
