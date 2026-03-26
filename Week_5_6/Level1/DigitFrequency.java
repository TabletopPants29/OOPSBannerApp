import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative numbers
        if (number < 0) number = -number;

        long original = number;

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

        // Find frequency of each digit (0-9)
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nDigit frequency in " + original + ":");
        for (int i = 0; i <= 9; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
