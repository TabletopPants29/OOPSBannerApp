// Level 1 - Problem 4
// Create a program to calculate the profit and loss in number and percentage
// based on the cost price of INR 129 and the selling price of INR 191.
// I/P => NONE
// O/P =>
// The Cost Price is INR ___ and Selling Price is INR ___
// The Profit is INR ___ and the Profit Percentage is ___

class ProfitLoss {
    public static void main(String[] args) {

        // Create a variable costPrice and assign 129
        double costPrice = 129;

        // Create a variable sellingPrice and assign 191
        double sellingPrice = 191;

        // Compute profit
        double profit = sellingPrice - costPrice;

        // Compute profit percentage
        double profitPercentage = profit / costPrice * 100;

        // Display the result using a single print statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
