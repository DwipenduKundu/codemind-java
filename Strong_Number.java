import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            prod = 1;
            int a = n % 10;
            n = n / 10;
            for (int i = 1; i <= a; i++) {
                prod *= i;
            }
            sum += prod;
        }
        if (temp == sum) {
            System.out.println("The number " + temp + " is a strong number");
        } else {
            System.out.println("The number " + temp + " is not a strong number");
        }
    }
}


