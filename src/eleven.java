import java.util.Arrays;

public class eleven {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double priceCar = 15_000.00;
        boolean hasAutomaticTransmission = true;
        System.out.printf("Привет я менеждер салона %s ," +
                "\n У нас есть модель %s за %a, " +
                "\nЕсть ли у нее автоматическая коробка передач?" +
                "\n %b "
                ,carMark,carModel,priceCar,hasAutomaticTransmission ?"Да":"Нет");
    }
}
