package OOP.lesson7.lesson7.recursion;

public class Recursion {
    public int sum(int number){
        if (number < 1) {
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }
}
