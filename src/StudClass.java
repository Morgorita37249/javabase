public class StudClass {
    public static void main(String[] args){
        double height = 1.635;
        byte weight = 60;
        double answer = weight/(height*height);
        System.out.println(answer);
    }
}
class Animal{
    String name;
    int age;
    String voice;
    public void say(){
        System.out.println(voice);
    }
}