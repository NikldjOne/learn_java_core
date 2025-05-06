package Start.lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world";

        //Перевеод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        //Длина строки
        int length = text.length();
        System.out.println(length);
        //Есть ли в текст другой текст
        boolean world = text.contains("world");
        System.out.println(world);

        //Замена всех кусков текста на другой текст
        String replaceAll = text.replaceAll("r", "@");
        System.out.println(replaceAll);

        //Повторить текст n раз
        String repeat = text.repeat(10);
        System.out.println(repeat);

        //Разбить текст на массив String
        String names = "Yuri; Olga; Petya; Vasi";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Объеденение строк (конкатенация)
        String name = "Yuri";
        String surname = "Pupkin";
        String fullName = name + surname;
        System.out.println( fullName);

        //Начинается на подстроку
        boolean textStart = text.startsWith("Hello");
        System.out.println(textStart);

        //Заканчивается на подстроку
        boolean textEnd = text.endsWith("world");
        System.out.println(textEnd);

        //Обрезка строки
        String substring = text.substring(0, 5);
//        System.out.println(substring);

        String text2 = "My name is Giovanni Giorgio";
        String[] arrayString = text2.substring(11).toLowerCase().split(" ");
        System.out.println("--------" + Arrays.toString(arrayString));
        for (String str : arrayString){
            System.out.println(str + " " + str.length());
        }
        String s = "a";
        int count = 0;
        boolean end = false;
        for(int i = s.length() - 1; i >= 0; i--){
            if(!(s.charAt(i) == ' ')){
                count++;
            }else{
                if(count > 0){
                    break;
                }
            }
        }
        System.out.println(count);
    }


}
