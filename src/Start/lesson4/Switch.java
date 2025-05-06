package Start.lesson4;

public class Switch {
    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            case 1 -> System.out.println("a = 1");
            case 2 -> System.out.println("a = 2");
            case 3 -> System.out.println("a = 3");
            case 4 ->System.out.println("a = 4");
            default -> System.out.println("a = " + a);
        }
    }
}
