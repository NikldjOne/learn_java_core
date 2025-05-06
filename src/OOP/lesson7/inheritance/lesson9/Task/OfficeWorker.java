package OOP.lesson7.inheritance.lesson9.Task;

public abstract class OfficeWorker extends Human{

    public OfficeWorker(boolean isMan) {
        super(isMan);
    }

    public void drinkCoffee(){
        System.out.println("Сотрудник пьет кофе");
    }

    @Override
    public void getSalary() {

    }
}
