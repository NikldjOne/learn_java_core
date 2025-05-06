package OOP.lesson7.inheritance.lesson9.Task;

public class Task {
    public static void main(String[] args) {
        SecurityGuard securityGuard = new SecurityGuard(true);
        Accountant woman = new Accountant(false);
        Secretary secretary = new Secretary(false);
        secretary.getSalary();
        secretary.printDocs();
        securityGuard.getSalary();
        securityGuard.guarding();
        woman.getSalary();
        woman.calculateTaxes();
    }
}
