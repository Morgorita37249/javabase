package restics;

public class Restaurant {
    private static int sosageStock = 0;
    public static int breadStock = 0;

    private boolean checkStock (){
        if (sosageStock<=0){
            System.out.println("There is no sosage!");
            return false;
        } else if (breadStock<=0){
            System.out.println("There is no bread!");
            return false;
        }
        else return true;
    }
    public void makeMeal(){
        if (checkStock() == false){
            return;
        }
        sosageStock = sosageStock-1;
        breadStock = breadStock - 2;
        System.out.println("You get your meal!");
    }
    public static void getNewStock(int sosage, int bread){
        sosageStock +=sosage;
        breadStock += bread;
    }
}
