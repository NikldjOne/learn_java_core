package OOP.lesson7.inheritance.lesson9.dogs;

public class Poodle extends Dog {

    public Poodle() {
        super(28);
    }

    public  void run(){
        System.out.println("dow slow");
    }

    @Override
    public void breath() {
        System.out.println("Poodle breath");
    }
}
