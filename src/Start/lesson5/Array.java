package Start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int[] array = new int[2];
        array[0]= a;
        array[1] = b;
//        System.out.println(Arrays.toString(array));
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = {1,3,4};
//        System.out.println(array3[2]);
//        System.out.println(Arrays.toString(array2));


        int[] array1 = {a,b};
        int[] array4 = new int[2];
        array4[0] = array1[0];
        array4[1] = array1[1];
        array4[1] = 111;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));
        String[] arrayStr = new String[2];
        arrayStr[0] = "Katar";
        char[] answer = {'D', 'O', 'X', 'A'};
        System.out.println(answer);

    }
}
