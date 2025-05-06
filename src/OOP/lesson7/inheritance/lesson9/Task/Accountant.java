package OOP.lesson7.inheritance.lesson9.Task;

public class Accountant extends OfficeWorker{
    public int salary = 50_000;
    public boolean isOfficeWorker = true;

    public Accountant(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Бухгалтер получает зарплату " + salary);
    }

    public void calculateTaxes() {
        System.out.println("Считаем налоги");
    }
}
