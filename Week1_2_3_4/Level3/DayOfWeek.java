// Level 3 - Problem 11
// Write a program DayOfWeek that takes a date as input and prints the day of the week
// that the date falls on. Your program should take three command-line arguments: m (month),
// d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output
// print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas
// for the Gregorian calendar (where / denotes integer division):
//
// y0 = y - (14 - m) / 12
// x  = y0 + y0/4 - y0/100 + y0/400
// m0 = m + 12 * ((14 - m) / 12) - 2
// d0 = (d + x + 31*m0 / 12) mod 7
//
// I/P => m (month), d (day), y (year)
// O/P => Day of week as 0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take three command-line style inputs: month, day, year
        System.out.print("Enter the month (1=January, 2=February, ...): ");
        int m = input.nextInt();

        System.out.print("Enter the day: ");
        int d = input.nextInt();

        System.out.print("Enter the year: ");
        int y = input.nextInt();

        // Compute y0 = y - (14 - m) / 12
        int y0 = y - (14 - m) / 12;

        // Compute x = y0 + y0/4 - y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Compute m0 = m + 12 * ((14 - m) / 12) - 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Compute d0 = (d + x + 31*m0 / 12) mod 7
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Handle negative modulo result
        if (d0 < 0) {
            d0 += 7;
        }

        // Map d0 to day name
        String[] dayNames = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        // Display the result
        System.out.println("The day of the week for " + m + "/" + d + "/" + y +
                " is " + d0 + " (" + dayNames[d0] + ")");

        input.close();
    }
}
