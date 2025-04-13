package interfaces;

public class Main {
    public static void main(String[] args) {
        Flyable duck1 = new Duck();
        Flyable plain = new Plain();
        Swimmable duck2 = new Duck();
        Swimmable fish = new Fish();
        Swimmable [] swimmingPool = new Swimmable[]{duck2,fish};
        Flyable []sky = new Flyable[]{duck1, plain};
        for  (Flyable flyable: sky){
            flyable.fly();
        }
        for  (Swimmable swimmable: swimmingPool){
            swimmable.swim();
        }
    }
}
