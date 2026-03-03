// Level 2 - Problem 10
// Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
// Hint =>
//   a. Get an integer input and assign it to the number variable. Also define a greatestFactor
//      variable and assign it to 1.
//   b. Create a variable counter and assign counter = number - 1; Use the while loop till
//      the counter is equal to 1.
//   e. Inside the loop, check if the number is perfectly divisible by the counter then assign
//      the counter to greatestFactor variable and break the loop.
//   f. Display the greatestFactor variable outside the loop.
// I/P => number
// O/P => The greatest factor of ___ is ___

import java.util.Scanner;

class GreatestFactorWhile {
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
            // Create a variable counter and assign counter = number - 1
            int counter = number - 1;

            // Use the while loop till the counter is equal to 1
            while (counter >= 1) {
                // Check if number is perfectly divisible by the counter
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            // Display the greatestFactor variable outside the loop
            System.out.println("The greatest factor of " + number + " is " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
