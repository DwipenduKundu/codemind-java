import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the integer
        int num = scanner.nextInt();

        // Reverse the integer and display the result
        int reversedNum = reverseInteger(num);
        System.out.println(reversedNum);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse an integer
    private static int reverseInteger(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
