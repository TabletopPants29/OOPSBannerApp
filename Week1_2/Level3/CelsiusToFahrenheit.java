// Level 3 - Problem 1
// Write a TemperatureConversion program, given the temperature in Celsius
// as input output the temperature in Fahrenheit.
// Hint => Formula: (°C × 9/5) + 32 = °F
// I/P => celsius
// O/P => The ____ celsius is _____ fahrenheit

import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a celsius variable and take the temperature as user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit using: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        // Display the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}
