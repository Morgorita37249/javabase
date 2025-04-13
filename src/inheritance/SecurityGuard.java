package inheritance;

public class SecurityGuard extends Human{

    public SecurityGuard(String sex, int salary){
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
    public void doSecurity(){
        System.out.println("Сторожу!!! ");
    }
}
