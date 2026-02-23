// Level 1 - Problem 7
// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

class VolumeOfEarth {
    public static void main(String[] args) {

        // Radius of Earth in km
        double radiusKm = 6378;

        // Conversion: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;

        // Radius of Earth in miles
        double radiusMiles = radiusKm * kmToMiles;

        // Pi value
        double pi = Math.PI;

        // Compute volume in cubic kilometers: (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Compute volume in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Display the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}
