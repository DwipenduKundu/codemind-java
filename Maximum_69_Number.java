import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int result = calculateMaximumNumber(num);
        
        System.out.println( result);
        
        scanner.close();
    }
    
    public static int calculateMaximumNumber(int num) {
        String numStr = String.valueOf(num);
        int maxNum = num;

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '6') {
                numStr = numStr.substring(0, i) + "9" + numStr.substring(i + 1);
                break;
            }
        }

        try {
            maxNum = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            // Handle the exception if the modified string is not a valid integer
        }

        return Math.max(maxNum, num); 
    }
}