// Level 3 - Problem 4
// Rewrite Sample Program 2 (TravelComputation) with user inputs.
// I/P => name, fromCity, viaCity, toCity, distanceFromToVia, distanceViaToFinalCity,
//        timeFromToVia (hrs, mins), timeViaToFinalCity (hrs, mins)
// O/P => The Total Distance travelled by ___ from ___ to ___ via ___ is ___ km
//        and the Total Time taken is ___ minutes

import java.util.Scanner;

class TravelComputationInput {
    public static void main(String[] args) {

        // Create Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for names and cities
        System.out.print("Enter traveller's name: ");
        String name = input.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        String toCity = input.nextLine();

        // Take user inputs for distances
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (km): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (km): ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take user inputs for time
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (hours): ");
        int hoursFromToVia = input.nextInt();
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (minutes): ");
        int minsFromToVia = input.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (hours): ");
        int hoursViaToFinalCity = input.nextInt();
        System.out.print("Enter time from " + viaCity + " to " + toCity + " (minutes): ");
        int minsViaToFinalCity = input.nextInt();

        // Compute total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int timeFromToVia = hoursFromToVia * 60 + minsFromToVia;
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minsViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display the result
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");

        input.close();
    }
}
