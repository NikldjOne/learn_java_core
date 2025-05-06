package OOP.lesson7.inheritance.lesson9.dogs;

public class Terier extends Dog{

    public Terier() {
        super(20);
    }

    @Override
    public void run() {
        System.out.println("Terier run");
    }

    @Override
    public void breath() {
        System.out.println("Terier breath");
    }
}
