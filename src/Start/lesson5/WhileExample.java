package Start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
//        while (count <= 100) {
//            System.out.println(count);
//            count++;
//        }
        while (true) {
            System.out.println(count);
            if(count == 1_000_000_000){
                System.out.println("vse pizdec");
                break;
            }
            count++;
        }
    }
}
