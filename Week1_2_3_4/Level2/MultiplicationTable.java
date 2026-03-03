// Level 2 - Problem 3
// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint =>
//   a. Take integer input and store it in the variable number.
//   b. Using a for loop, find the multiplication table of number from 6 to 9 and print it
//      in the format number * i = ___
// I/P => number
// O/P => number * 6 = ___
//        number * 7 = ___
//        number * 8 = ___
//        number * 9 = ___

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take integer input and store in variable number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using a for loop, print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
