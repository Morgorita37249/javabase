package restics;

public class Main {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.makeMeal();
        Restaurant.getNewStock(100,200);
        rest.makeMeal();
    }
}
