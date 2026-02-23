// Level 3 - Problem 10
// Create a program to find the maximum number of handshakes among N students.
// Hint => combination = n * (n - 1) / 2
// I/P => numberOfStudents
// O/P => The maximum number of handshakes among ___ students is ___

import java.util.Scanner;

class MaxHandshakes {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input for numberOfStudents
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Use the combination formula to calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents +
                " students is " + maxHandshakes);

        input.close();
    }
}
