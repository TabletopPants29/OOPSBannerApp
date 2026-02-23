// Level 1 - Problem 3
// Create a program to convert the distance of 10.8 kilometers to miles.
// Hint: 1 km = 1.6 miles
// I/P => NONE
// O/P => The distance ___ km in miles is ___

class KmToMilesFixed {
    public static void main(String[] args) {

        // Create a variable distanceKm and assign 10.8
        double distanceKm = 10.8;

        // Conversion factor: 1 km = 1.6 miles
        double kmToMilesFactor = 1.6;

        // Compute the distance in miles
        double distanceMiles = distanceKm * kmToMilesFactor;

        // Display the result
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}
