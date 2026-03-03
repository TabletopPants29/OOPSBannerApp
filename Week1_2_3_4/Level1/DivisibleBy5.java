// Level 1 - Problem 1
// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        input.close();
    }
}
