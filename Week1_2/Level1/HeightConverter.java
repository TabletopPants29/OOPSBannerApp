// Level 1 - Problem 10
// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double height = input.nextDouble();

        // Conversion factors
        double cmPerInch = 2.54;
        double inchesPerFoot = 12;

        // Compute total inches
        double totalInches = height / cmPerInch;

        // Compute feet and remaining inches
        double feet = totalInches / inchesPerFoot;
        double inches = totalInches % inchesPerFoot;

        // Display the result
        System.out.println("Your Height in cm is " + height +
                " while in feet is " + feet +
                " and inches is " + inches);

        input.close();
    }
}
