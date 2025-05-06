package Start.lesson6;

public class Practics {
    public static void main(String[] args) {
        upDownRegister("Hello");
        upDownRegister("world!");
        searchJava("Fava men");
        searchJava("Java men");
        replaceAll("dasqe21dadxzcadaeewtfdrtyugcdhikl");
        repeatN("Java", 5);
        splitArray();
        concatinance();
        checkStartAndEnd();
        SearchSub();
        revertStr();
    }

    public static void upDownRegister(String str) {
        if(str.length() % 2 ==0){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }
    public static void searchJava(String str){
        System.out.println(str.toLowerCase().contains("java"));
    }
    public static void replaceAll(String str) {
        System.out.println(str.replaceAll("[aeiou]", "*"));
    }

    public static void repeatN(String str, int n) {
        System.out.println(str.repeat(n));
    }

    public static void splitArray() {
        String[] array = "apple,banana,orange,grape".split(",");
        for (String word: array){
            System.out.println(word);
        }
    }

    public static void concatinance() {
       String name = "John", surname = "Doe", patronymic = "Smith";
       String fullName = name + " " + surname + ' ' + patronymic;
        System.out.println(fullName);
    }

    public static void checkStartAndEnd() {
       String[] arraysNames = {"Mr. Smith.","Ms. Smith.","Dr. Jonn."};
       for (String names : arraysNames) {
           boolean startCorrectly = names.startsWith("Mr.") || names.startsWith("Ms.") || names.startsWith("Dr.");
           boolean endsCorrectly = names.endsWith(".");
           System.out.println(startCorrectly && endsCorrectly);
       }
    }

    public static void SearchSub() {
        String text = "Programming is fun";
        int  index = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                index = i;
                break;
            }
        }
        System.out.println(text.substring(index));
    }

    public static void revertStr() {
        String text = "Hello цщкдв[";
        String textResult = "";
        System.out.println(text.length());
        for (int i = text.length() - 1; i >= 0; i--) {
            textResult += text.charAt(i);
        }
        System.out.println(textResult);
    }
}
