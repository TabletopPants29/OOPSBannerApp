// Level 2 - Problem 7
// Write an IntOperation program by taking a, b, and c as input values
// and print the following integer operations: a + b*c, a*b + c, c + a/b, a%b + c
// I/P => a, b, c
// O/P => The results of Int Operations are ___, ___, ___, and ___

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Create variables a, b, and c of int data type and take user input
        System.out.print("Enter value of a (integer): ");
        int a = input.nextInt();

        System.out.print("Enter value of b (integer): ");
        int b = input.nextInt();

        System.out.print("Enter value of c (integer): ");
        int c = input.nextInt();

        // Compute integer operations (operator precedence applied)
        // * and / have higher precedence than + and %
        int result1 = a + b * c; // b*c computed first, then a+
        int result2 = a * b + c; // a*b computed first, then +c
        int result3 = c + a / b; // a/b computed first, then c+
        int result4 = a % b + c; // a%b computed first, then +c

        // Display the result
        System.out.println("The results of Int Operations are " +
                result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
