import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Calculate and display the GCD
        int gcd = calculateGCD(num1, num2);
        System.out.println(gcd);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the GCD using the Euclidean algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
