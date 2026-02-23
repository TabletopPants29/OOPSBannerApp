// Level 1 - Problem 6
// The University is charging the student a fee of INR 125000 for the course.
// The University is willing to offer a discount of 10%.
// Write a program to find the discounted amount and discounted price.
// I/P => NONE
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

class UniversityFeeDiscount {
    public static void main(String[] args) {

        // Create a variable fee and assign 125000
        double fee = 125000;

        // Create a variable discountPercent and assign 10
        double discountPercent = 10;

        // Compute discount
        double discount = fee * discountPercent / 100;

        // Compute the final discounted fee
        double discountedFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);
    }
}
