// Level 2 - Problem 8
// Write the DoubleOpt program by taking double values a, b, and c
// and doing the same operations as IntOperation.
// I/P => a, b, c (double)
// O/P => The results of Double Operations are ___, ___, ___, and ___

import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables a, b, and c of double data type and take user input
        System.out.print("Enter value of a (double): ");
        double a = input.nextDouble();

        System.out.print("Enter value of b (double): ");
        double b = input.nextDouble();

        System.out.print("Enter value of c (double): ");
        double c = input.nextDouble();

        // Compute double operations (operator precedence applied)
        // * and / have higher precedence than + and %
        double result1 = a + b * c; // b*c computed first, then a+
        double result2 = a * b + c; // a*b computed first, then +c
        double result3 = c + a / b; // a/b computed first, then c+
        double result4 = a % b + c; // a%b computed first, then +c

        // Display the result
        System.out.println("The results of Double Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
