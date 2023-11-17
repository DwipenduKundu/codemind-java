import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            prod *= a;
            sum += a;
        }
        if (prod == sum) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}

