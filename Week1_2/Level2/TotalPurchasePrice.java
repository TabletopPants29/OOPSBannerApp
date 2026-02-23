// Level 2 - Problem 5
// Write a program to input the unit price of an item and the quantity to be
// bought. Then, calculate the total price.
// I/P => unitPrice, quantity
// O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Take user input for quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Compute total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);

        input.close();
    }
}
