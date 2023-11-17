import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num1 = scanner.nextInt();

        
        int num2 = scanner.nextInt();

        // Calculate the LCM
        int lcm = calculateLCM(num1, num2);

        // Display the result
        System.out.println(lcm);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate LCM using GCD (Euclidean Algorithm)
    private static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to calculate GCD using Euclidean Algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
