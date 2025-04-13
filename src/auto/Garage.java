package auto;

public class Garage {
    private Auto [] garage = new Auto []{null,null};
//    {
//        for (Auto car : garage) {
//            car = null;
//        }
//    }
    public void setCar(Auto car){
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }
    }
    public void CarInformation(){
        for (int i = 0; i < garage.length; i++) {
            System.out.printf("%s + %d",garage[i].getMark(),garage[i].getMaxSpeed());
        }

    }
}
