// Level 2 - Problem 11
// Create a program to find all the multiples of a number taken as user input below 100.
// Hint =>
//   a. Get the input value for a variable named number. Check the number is a positive integer
//      and less than 100.
//   b. Run a for loop backward: from i = 100 to i = 1.
//   c. Inside the loop, check if i perfectly divides the number. If true, print the number and
//      continue the loop.
// I/P => number
// O/P => Prints all multiples of the number below 100

import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input value for a variable named number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");

            // Run a for loop backward: from i = 100 to i = 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is perfectly divisible by the number
                if (i % number == 0) {
                    System.out.println(i);
                    continue;
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer less than 100");
        }

        input.close();
    }
}
