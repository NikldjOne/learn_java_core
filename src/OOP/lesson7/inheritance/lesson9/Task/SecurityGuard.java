package OOP.lesson7.inheritance.lesson9.Task;

public class SecurityGuard extends Human{
    public int salary = 15_000;

    public SecurityGuard(boolean isMan) {
        super(isMan);
    }

    public void guarding(){
        System.out.println("Охраник сторожит");
    }
    public void getSalary(){
        System.out.println("Охраник получает зарплату " + salary);
    }

}
