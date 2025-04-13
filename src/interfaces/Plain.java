package interfaces;

public class Plain implements Flyable {
    @Override
    public void fly(){
        System.out.println("самолеет потелел");
    }
}
