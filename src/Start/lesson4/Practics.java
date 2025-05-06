package Start.lesson4;

public class Practics {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int count = 0;
         count  += isFineWheel1 ? 1 :0;
         count  += isFineWheel2 ? 1 :0;
         count  += isFineWheel3 ? 1 :0;
         count  += isFineWheel4 ? 1 :0;

        if(isWorkEngine && isWorkTransmission && (count >= 3)){
            System.out.println("Машина готова");
        }else{
            System.out.println("Машина не готова");
        }

    }
}
