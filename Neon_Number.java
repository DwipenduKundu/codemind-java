import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n * n;
        int b = temp;
        int sum = 0;
        while (b != 0) {
            int a = b % 10;
            b = b / 10;
            sum += a;
        }
        if (n == sum) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}

