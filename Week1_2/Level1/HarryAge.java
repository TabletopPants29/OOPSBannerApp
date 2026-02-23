// Level 1 - Problem 1
// Write a program to find the age of Harry if the birth year is 2000.
// Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___

class HarryAge {
    public static void main(String[] args) {

        // Create a variable name to indicate the person
        String name = "Harry";

        // Create a variable birthYear and assign 2000
        int birthYear = 2000;

        // Create a variable currentYear and assign 2024
        int currentYear = 2024;

        // Compute age by subtracting birthYear from currentYear
        int age = currentYear - birthYear;

        // Display the result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
