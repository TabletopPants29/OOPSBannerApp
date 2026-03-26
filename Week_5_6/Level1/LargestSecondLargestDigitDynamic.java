import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative numbers
        if (number < 0) number = -number;

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        long temp = number;

        while (temp != 0) {
            if (index == maxDigit) {
                // Dynamically increase array size by 10
                maxDigit += 10;
                int[] tempArr = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) {
                    tempArr[j] = digits[j];
                }
                digits = tempArr;
            }
            digits[index] = (int)(temp % 10);
            temp = temp / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nDigits of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
            if (i < index - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
