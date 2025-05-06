package OOP.lesson7.inheritance.lesson9.Task;

public class Secretary extends OfficeWorker{
    public int salary = 30_000;

    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Секретарь получает зарплату " + salary);
    }

    public void printDocs(){
        System.out.println("Секретарь печатает документы");
    }
}
