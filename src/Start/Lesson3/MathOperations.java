package Start.Lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        //Plus
        int sum = x + y;
//        System.out.println(sum);

        //Minus
        int diff = x - y;
//        System.out.println(diff);

        //Multiply
        int multiply = x * y;
//        System.out.println(multiply);

        //Divide
        y = 3;
        double divide = (double) x / y;
//        System.out.println(divide);

        int ext = x * x;
//        System.out.println(ext);

        //Increment
//        x = x + 1;
//        x++;
//        x += 10;
//        System.out.println(x);

        //Decrement
//        x = x - 1;
//        x--;
//        x -= 10;
//        System.out.println(x);


        int number = 4;

        int modulo = 9 % 3;
//        System.out.println(modulo);


        int z =( 2 + 2) * 2;
//        System.out.println(z);


        double height = 1.87;
        double weight = 95.5;
        double imt = weight / (height * height);
        System.out.println(imt);
    }
}
