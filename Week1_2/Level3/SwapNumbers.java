// Level 3 - Problem 5
// Create a program to swap two numbers.
// I/P => number1, number2
// O/P => The swapped numbers are ___ and ___

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable number1 and take user input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        // Create a variable number2 and take user input
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Swap number1 and number2 using a temporary variable
        double temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}
