// Level 3 - Problem 6
// An athlete runs in a triangular park with sides provided as input by the user in meters.
// If the athlete wants to complete a 5 km run, how many rounds must the athlete complete?
// Hint => Perimeter = sum of all sides; rounds = distance / perimeter
// I/P => side1, side2, side3
// O/P => The total number of rounds the athlete will run is ___ to complete 5 km

import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the three sides of the triangular park in meters
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        // Target distance in meters (5 km = 5000 m)
        double targetDistanceMeters = 5000;

        // Compute perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Compute number of rounds: distance / perimeter
        double numberOfRounds = targetDistanceMeters / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " +
                numberOfRounds + " to complete 5 km");

        input.close();
    }
}
