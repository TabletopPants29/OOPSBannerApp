// Level 3 - Problem 2
// Write a TemperatureConversion program, given the temperature in Fahrenheit
// as input outputs the temperature in Celsius.
// Hint => Formula: (°F − 32) × 5/9 = °C
// I/P => fahrenheit
// O/P => The ____ fahrenheit is _____ celsius

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a fahrenheit variable and take the user's input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using: (°F − 32) × 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;

        // Display the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        input.close();
    }
}
