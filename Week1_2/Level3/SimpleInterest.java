// Level 3 - Problem 8
// Write a program to input the Principal, Rate, and Time values
// and calculate Simple Interest.
// Hint => Simple Interest = Principal * Rate * Time / 100
// I/P => principal, rate, time
// O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for principal
        System.out.print("Enter Principal amount (INR): ");
        double principal = input.nextDouble();

        // Take user input for rate of interest
        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        // Take user input for time
        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();

        // Compute Simple Interest
        double simpleInterest = principal * rate * time / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}
