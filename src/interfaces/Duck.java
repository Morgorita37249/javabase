package interfaces;

public class Duck implements Flyable, Swimmable {
    @Override
    public void swim(){
        System.out.println("уточка поплыла");
    }
    @Override
    public void fly(){
        System.out.println("уточка потелела");
    }
}
