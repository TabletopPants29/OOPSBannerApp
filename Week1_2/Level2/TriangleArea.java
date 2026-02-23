// Level 2 - Problem 2
// Write a program that takes the base and height in cm to find the area of
// a triangle in square inches and square centimeters.
// Hint => Area of a Triangle is 1/2 * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for base and height in cm
        System.out.print("Enter base of triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in cm): ");
        double height = input.nextDouble();

        // Conversion factor: 1 inch = 2.54 cm
        double cmPerInch = 2.54;

        // Compute area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Compute area in square inches
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);

        // Display the result
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                " and sq cm is " + areaSqCm);

        input.close();
    }
}
