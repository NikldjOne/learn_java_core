package Start.Lesson3;

public class Primitives {
    public static void main(String[] args) {
        boolean answerYuri = true;
        boolean answerIvan = false;


        byte maxByte = 127;
        byte minByte = -128;

        short maxShort = 32_767;
        short minShort = -32_768;

        int maxInt = 2_147_483_647 + 1;
        int minInt = -2_147_483_648 - 2;

        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        maxInt = (int) maxLong;
        double myBottle = 1.5;
        float cola = 0.33F;

        double doubleNumber = 1.1234567891011121314;
        float floatNumber = 1.1234567891011F;

//        System.out.println(doubleNumber);
//        System.out.println(floatNumber);

         short s = 128;
         byte b = (byte) s;
//         System.out.println(b);

         double d = 0.1 + 0.2;
         float f = 0.1f + 0.2f;
//         System.out.println(d == f);
//        System.out.println(minInt);
//        System.out.println(intAge(20));
//        System.out.println(intAge(1));


        char letter = 'Я' + 1;
//        System.out.println(letter);
        char newLine = '\n';
        System.out.print('a');
//        System.out.print(newLine);
        System.out.print('b');
    }


    public static boolean intAge(int age) {
        return age >= 18;
    }

}
