import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
        boolean is_prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}


