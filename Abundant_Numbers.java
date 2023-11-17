import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (n < s) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


