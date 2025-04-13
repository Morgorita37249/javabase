import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] check = new int[5];
        for (int i=0; i<check.length;i++) {
            int number = scanner.nextInt();
            check[i]=number;
        }

        for (int i=0; i<check.length;i++) {
            System.out.println(check[i]);
        }
        scanner.close();
    }
}