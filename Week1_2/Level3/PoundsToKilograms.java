// Level 3 - Problem 9
// Create a program to convert weight from pounds to kilograms.
// Hint => 1 pound = 2.2 kg
// I/P => weight (in pounds)
// O/P => The weight of the person in pounds is ___ and in kg is ___

import java.util.Scanner;

class PoundsToKilograms {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Conversion factor: 1 pound = 2.2 kg
        double poundsToKg = 2.2;

        // Compute weight in kilograms
        double weightInKg = weight / poundsToKg;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weight +
                " and in kg is " + weightInKg);

        input.close();
    }
}
