// Level 3 - Problem 7
// Create a program to divide N number of chocolates among M children.
// I/P => numberOfChocolates, numberOfChildren
// O/P => The number of chocolates each child gets is ___
//        and the number of remaining chocolates are ___

import java.util.Scanner;

class ChocolateDistribution {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Get an integer value for numberOfChocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Get an integer value for numberOfChildren
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Find the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Find the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                " and the number of remaining chocolates are " + remainingChocolates);

        input.close();
    }
}
