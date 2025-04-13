package interfaces;

public interface Swimmable {
    default void swim(){
        System.out.println("нечто поплыло");
    }
}
