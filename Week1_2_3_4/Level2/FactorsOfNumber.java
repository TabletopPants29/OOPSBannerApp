// Level 2 - Problem 7
// Create a program to find the factors of a number taken as user input.
// Hint =>
//   a. Get the input value for a variable named number and check if it is a positive integer.
//   b. Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number
//      is perfectly divisible by i. If true, print the value of i.
// I/P => number
// O/P => Prints all factors of the number

import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input value for a variable named number and check if it is a positive
        // integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + ":");

            // Run a for loop from i = 1 to i < number
            for (int i = 1; i < number; i++) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
