import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if (Math.sqrt(a) - (int) Math.sqrt(a) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}


