package hashcode;

public class Main {
    public static void main(String[] args) {
        Person person1  = new Person("111111");
        Person person2  = new Person("222222");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
