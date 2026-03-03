// Level 2 - Problem 12
// Create a program to find the power of a number.
// Hint =>
//   a. Get integer input for two variables - number and power and check for positive integer.
//   b. Create a result variable with an initial value of 1.
//   c. Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the
//      result by the number and assign the value to the result. Finally, print the result.
// I/P => number, power
// O/P => ___ raised to the power of ___ is ___

import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for number and power and check for positive integer
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check both are positive integers
        if (number > 0 && power > 0) {
            // Create a result variable with an initial value of 1
            int result = 1;

            // Run a for loop from i = 1 to i <= power
            for (int i = 1; i <= power; i++) {
                // Multiply result by the number
                result = result * number;
            }

            // Print the result
            System.out.println(number + " raised to the power of " + power + " is " + result);
        } else {
            System.out.println("Please enter positive integers for both number and power");
        }

        input.close();
    }
}
