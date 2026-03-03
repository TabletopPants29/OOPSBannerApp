// Level 1 - Problem 4
// Write a program to check for the natural number and write the sum of n natural numbers.
// Hint => A Natural Number is a positive integer (1, 2, 3, etc.) sometimes with the inclusion of 0
//         A sum of n natural numbers is n * (n+1) / 2
// I/P => number
// O/P =>
// If the number is a positive integer then the output is:
// The sum of ___ natural numbers is ___
// Otherwise: The number ___ is not a natural number

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a positive integer (natural number)
        if (number > 0) {
            // Compute sum of n natural numbers using formula
            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
