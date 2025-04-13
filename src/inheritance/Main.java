package inheritance;

public class Main {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("жен", 30_000);
        Accountant accountant = new Accountant("муж", 50_000);
        SecurityGuard guard = new SecurityGuard("муж", 15_000);
        secretary.printDocument();
        accountant.countTaxes();
        guard.doSecurity();
    }
}
