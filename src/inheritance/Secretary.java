package inheritance;

public class Secretary extends OfficeWorker{

    public Secretary(String sex, int salary){
        super(sex, salary);
    }

    @Override
    public int getSalary() {
        return super.salary;
    }
    @Override
    public void setSalary(int salary) {
        super.salary = salary;
    }
    public void printDocument(){
        System.out.println("Печатаю документик!!! ");
    }
}
