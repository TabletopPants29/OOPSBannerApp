// Level 2 - Problem 1
// Write a program to create a basic calculator for addition, subtraction,
// multiplication, and division. Ask for two numbers (floating point).
// I/P => number1, number2
// O/P => The addition, subtraction, multiplication, and division value of
//        2 numbers ___ and ___ is ___, ____, ____, and ___

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables number1 and number2 and take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                number1 + " and " + number2 + " is " +
                addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}
