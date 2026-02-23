// Level 1 - Problem 8
// Create a program to convert distance in kilometers to miles (user input).
// Hint => 1 mile = 1.6 km
// I/P => km
// O/P => The total miles is ___ mile for the given ___ km

import java.util.Scanner;

class KmToMilesInput {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable km as double and take user input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor: 1 mile = 1.6 km
        double kmToMilesFactor = 1.6;

        // Compute miles
        double miles = km / kmToMilesFactor;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
