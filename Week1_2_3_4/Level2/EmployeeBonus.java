// Level 2 - Problem 2
// Create a program to find the bonuses of employees based on their years of service.
// Hint =>
//   a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//   b. Take salary and year of service in the year as input.
//   c. Print the bonus amount.
// I/P => salary, yearsOfService
// O/P => The bonus amount is INR ___

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take salary as input
        System.out.print("Enter the employee's salary (INR): ");
        double salary = input.nextDouble();

        // Take year of service as input
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Check if employee qualifies for 5% bonus (more than 5 years)
        if (yearsOfService > 5) {
            // Compute bonus amount
            double bonus = salary * 5 / 100;
            System.out.println("The bonus amount is INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        input.close();
    }
}
