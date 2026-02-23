// Level 1 - Problem 9
// Write a new program similar to program 6 but take user input
// for Student Fee and University Discount
// I/P => fee, discountPercent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

class FeeDiscountInput {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable fee and take user input
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        // Create a variable discountPercent and take user input
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Compute discount
        double discount = fee * discountPercent / 100;

        // Compute the final discounted fee
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);

        input.close();
    }
}
