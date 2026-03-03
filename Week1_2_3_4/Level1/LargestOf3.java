// Level 1 - Problem 3
// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P =>
// Is the first number the largest? ___
// Is the second number the largest? ___
// Is the third number the largest? ___

import java.util.Scanner;

class LargestOf3 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for 3 numbers
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        // Check if number1 is the largest
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // Check if number2 is the largest
        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Check if number3 is the largest
        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }

        input.close();
    }
}
