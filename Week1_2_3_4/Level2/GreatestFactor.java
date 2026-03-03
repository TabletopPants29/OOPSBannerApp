// Level 2 - Problem 9
// Create a program to print the greatest factor of a number beside itself using a for loop.
// Hint =>
//   a. Get an integer input and assign it to the number variable. Also define a greatestFactor
//      variable and assign it to 1.
//   b. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
//   c. Inside the loop, check if the number is perfectly divisible by i then assign i to
//      greatestFactor variable and break the loop.
//   d. Display the greatestFactor variable outside the loop.
// I/P => number
// O/P => The greatest factor of ___ is ___

import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get an integer input and assign it to the number variable
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Also define a greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // Check if number is a positive integer
        if (number > 0) {
            // Create a for loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            // Display the greatestFactor variable outside the loop
            System.out.println("The greatest factor of " + number + " is " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
