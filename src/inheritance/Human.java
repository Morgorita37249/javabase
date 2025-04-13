package inheritance;

public abstract class Human {
    protected String sex ="";
    protected int salary = 0;
    public Human(String sex, int salary){
        this.salary = salary;
        this.sex = sex;
    }

    public abstract int getSalary();
    public abstract void setSalary(int salary);
}
