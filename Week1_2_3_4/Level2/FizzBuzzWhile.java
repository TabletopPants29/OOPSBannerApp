// Level 2 - Problem 5
// Rewrite the program 4 FizzBuzz using the while loop
// I/P => number
// O/P => Prints numbers from 1 to number with Fizz/Buzz/FizzBuzz substitutions (while loop version)

import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take the user input number and check for a positive integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            // Use while loop to display FizzBuzz from 1 to number
            int i = 1;
            while (i <= number) {
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
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
