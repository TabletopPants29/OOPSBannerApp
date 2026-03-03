// Level 1 - Problem 2
// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ___

import java.util.Scanner;

class SmallestOf3 {
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

        // Check if number1 is smaller than both number2 and number3
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        input.close();
    }
}
