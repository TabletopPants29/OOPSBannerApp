// Level 3 - Problem 3
// Create a program to find the total income of a person by taking salary and bonus from user.
// I/P => salary, bonus
// O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___

import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable named salary and take user input
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();

        // Create another variable bonus and take user input
        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();

        // Compute income by adding salary and bonus
        double income = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + income);

        input.close();
    }
}
