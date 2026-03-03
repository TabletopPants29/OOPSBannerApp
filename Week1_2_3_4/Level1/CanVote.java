// Level 1 - Problem 5
// Write a program to check whether a person can vote, depending on whether his/her age
// is greater than or equal to 18.
// Hint =>
//   a. Get integer input from the user and store it in the age variable.
//   b. If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote."
// I/P => age
// O/P =>
// If the person's age is greater or equal to 18 then the output is:
// The person's age is ___ and can vote.
// Otherwise: The person's age is ___ and cannot vote.

import java.util.Scanner;

class CanVote {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if person can vote (age >= 18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
