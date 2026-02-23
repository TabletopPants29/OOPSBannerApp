// Level 2 - Problem 6
// Write a program to take 2 numbers and print their quotient and remainder.
// Hint => Use division operator (/) for quotient and modulus operator (%) for remainder
// I/P => number1, number2
// O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Compute quotient using division operator
        int quotient = number1 / number2;

        // Compute remainder using modulus operator
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);

        input.close();
    }
}
