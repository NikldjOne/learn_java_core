package Start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q7";
        double price = 15_000_000;
        boolean hasAutomaticTransmission = true;
//        System.out.printf("Привет, я менеджер салона %s \nУ нас есть модель - %s за %f\nЕсть ли у нее коробка передач? - %s",
//                carMark,carModel,price,hasAutomaticTransmission ? "Да" : "Нет");
        String result = """
                Привет, я менеджер салона %s
                У нас есть модель - %s за %f
                Есть ли у нее коробка передач? - %s
                """.formatted(carMark,carModel,price,hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
