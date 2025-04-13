package auto;

public class Auto {
    private String mark = "";
    private int maxSpeed = 220;
    public Auto(){
    }
    public Auto(String mark){
        this.mark=mark;
    }
    public Auto(String mark,int maxSpeed){
        this.mark=mark;
        this.maxSpeed = maxSpeed;
    }
    public void printSpeedUp100(){
        System.out.printf("Скорость разгона до 100 км/ч %d", (110/(this.maxSpeed/20)));
    }
    public String getMark(){
        return mark;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
