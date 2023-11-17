import java.util.Scanner;
import java.util.HashSet;

public class UniqueNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int len = input.length();
        int[] arr = new int[len];
        int temp = 0;

        for (int i = 0; i < len; i++) {
            char digit = input.charAt(i);
            arr[i] = digit - '0';
            temp = temp * 10 + arr[i];
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        if (set.size() == arr.length) {
            System.out.println("Unique Number");
        } else {
            System.out.println("Not Unique Number");
        }
    }
}