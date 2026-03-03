// Level 2 - Problem 1
// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint =>
//   a. Get an integer input from the user, assign to a variable number and check for Natural Number.
//   b. Using a for loop, iterate from 1 to the number.
//   c. In each iteration of the loop, print the number is odd or even number.
// I/P => number
// O/P => Prints each number and whether it is odd or even

import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user and check for Natural Number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a natural number
        if (number > 0) {
            // Using a for loop, iterate from 1 to the number
            for (int i = 1; i <= number; i++) {
                // In each iteration, print if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
