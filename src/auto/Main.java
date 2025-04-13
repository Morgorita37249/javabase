package auto;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setMark("ZvorykinCar");
        Auto auto2 = new Auto();
        auto2.setMark("SuperCar");
        auto2.setMaxSpeed(400);
        Garage garage = new Garage();
        garage.setCar(auto1);
        garage.setCar(auto2);
        garage.CarInformation();
    }
}