// Level 2 - Problem 3
// Write a program to find the side of the square whose perimeter you read from the user.
// Hint => Perimeter of the Square is 4 times the side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ___

import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Compute side: perimeter = 4 * side => side = perimeter / 4
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        input.close();
    }
}
