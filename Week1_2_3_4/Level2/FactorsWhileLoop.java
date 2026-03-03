// Level 2 - Problem 8
// Rewrite the above program 7 to find the factors of a number using the while loop
// Hint =>
//   a. Get the input value for a variable named number and check if it is a positive integer.
//   b. Create a counter variable and run the while loop till the counter is less than the
//      user input number. In each iteration of the loop, check if the number is perfectly
//      divisible by the counter. If true, print the value of the counter.
// I/P => number
// O/P => Prints all factors of the number

import java.util.Scanner;

class FactorsWhileLoop {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input value for a variable named number and check if it is a positive
        // integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + ":");

            // Create a counter variable and run the while loop
            int counter = 1;
            while (counter < number) {
                // Check if number is perfectly divisible by the counter
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}
