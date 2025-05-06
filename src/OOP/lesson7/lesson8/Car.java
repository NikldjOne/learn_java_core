package OOP.lesson7.lesson8;

public class Car {
    public String brand;
    private static  int counterCars = 0;
    public final static String BWM_INFO = "BMW - немецкий бренд автомобилей, основаная в 1916 году";
    public final static String AUDI_INFO = "AUDI - немецкий бренд автомобилей, основаная в 1926 году";
    public final static String KIA_INFO = "KIA - корейский бренд автомобилей, основаная в 1936 году";
    public final static String[] BRANDS_DESCRIPTION = new String[3];

    static {
        BRANDS_DESCRIPTION[0] = BWM_INFO;
        BRANDS_DESCRIPTION[1] = AUDI_INFO;
        BRANDS_DESCRIPTION[2] = KIA_INFO;
        //Инициализируется при обращение к классу, или при создание экземпляра
    }
    public Car(String brand){
        this.brand = brand;
        counterCars++;
    }

    public String getBrand() {
        return brand;
    }

    public int getCounterCars() {
        return counterCars;
    }

    public static void printInfoByCar(){
        System.out.println("Перечень доступных брендов: kia, bmw, audi");
    }
}
