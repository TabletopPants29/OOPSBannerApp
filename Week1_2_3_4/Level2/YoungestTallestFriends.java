// Level 2 - Problem 6
// Create a program to find the youngest friend and the tallest among 3 friends:
// Amar, Akbar, and Anthony based on their ages and their heights
// Hint =>
//   a. Take user input for the age and height of the 3 friends and store it in a variable
//   b. Find the largest of the 3 ages to find the youngest friend and display it
//   c. Find the largest of the 3 heights to find the tallest friend and display it
// I/P => age1, age2, age3, height1, height2, height3
// O/P => The youngest friend is ___ and the tallest friend is ___

import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for age and height of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = input.nextDouble();

        // Take user input for age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = input.nextDouble();

        // Take user input for age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = input.nextDouble();

        // Find the youngest friend (smallest age)
        String youngestFriend;
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        String tallestFriend;
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the result
        System.out.println("The youngest friend is " + youngestFriend +
                " and the tallest friend is " + tallestFriend);

        input.close();
    }
}
