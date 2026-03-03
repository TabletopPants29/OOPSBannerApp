// Level 2 - Problem 4
// Write a program FizzBuzz, take a number as user input, and check for a positive integer.
// If positive integer, loop and print the number; for multiples of 3 print "Fizz" instead of
// the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz"
// Hint =>
//   a. Take the user input number, check for a positive integer, and use for loop to display
// I/P => number
// O/P => Prints numbers from 1 to number with Fizz/Buzz/FizzBuzz substitutions

import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take the user input number and check for a positive integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            // Use for loop to display FizzBuzz from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise print the number
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
