import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        long number = scanner.nextLong();

        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) number = -number;

        // Count digits
        int digitCount = 0;
        long temp = number;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }
        }

        // Store digits
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int)(temp % 10);
            temp = temp / 10;
        }

        // Create reversed array
        int[] reversed = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversed[i] = digits[digitCount - 1 - i];
        }

        System.out.print("\nOriginal number: " + (isNegative ? "-" : "") + number);
        System.out.print("\nReversed number: " + (isNegative ? "-" : ""));
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        scanner.close();
    }
}
