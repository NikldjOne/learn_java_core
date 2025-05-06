package OOP.lesson7.Task;

public class Restaurant {
    private static int sosigest = 0;
    private static int bread = 0;


    public  void getEat(){
        if(sosigest < 1 || bread < 2){
            System.out.println("Ингридентов не хватает!");
            return;
        }
        sosigest--;
        bread -= 2;
        System.out.println("Хот-дог приготовлен");
    }
    public  void addProducts(){
        sosigest += 100;
        bread += 200;
        System.out.println("Get produts");
    }
}
