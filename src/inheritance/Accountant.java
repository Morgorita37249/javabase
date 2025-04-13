package inheritance;

public class Accountant extends OfficeWorker{

    public Accountant(String sex, int salary){
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
    public void countTaxes(){
        System.out.println("Считаю нологи!!! ");
    }
}
