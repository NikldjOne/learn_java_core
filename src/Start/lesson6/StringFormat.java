package Start.lesson6;
//%s для строк (String)
//%d для целых чисел (int, long, byte, short)
//%f для чисел с плавающей точкой (float, double)
//%c для символов (char)
//%b для булевых значений (boolean)
//%x для целых чисел в шестнадцатеричном представлении
//%t для форматирования даты и времени

public class StringFormat {
    public static void main(String[] args) {
        String name = "Юрий";
        int age = 30;
//        String phrase = "Меня зовут " + name + '.' + " Мне " + age + " лет.";
        String phrase = String.format("Меня зовут %s. Мне %d лет.",name, age);
        System.out.println(phrase);
        System.out.printf("Меня зовут %s. Мне %d лет.",name, age);
    }

}
