import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            int n = scanner.nextInt();
            int temp = n;
            int rem = 0;
            while (n != 0) {
                int a = n % 10;
                n = n / 10;
                rem = a + (rem * 10);
            }
            if (rem == temp) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}


