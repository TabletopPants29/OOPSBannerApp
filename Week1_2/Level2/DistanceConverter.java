// Level 2 - Problem 4
// Write a program to find the distance in yards and miles for a distance in feet.
// Hint => 1 mile = 1760 yards and 1 yard = 3 feet
// I/P => distanceInFeet
// O/P => The distance in yards is ___ while the distance in miles is ___

import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Compute distance in yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Compute distance in miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
