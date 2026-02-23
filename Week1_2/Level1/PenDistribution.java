// Level 1 - Problem 5
// Suppose you have to divide 14 pens among 3 students equally.
// Write a program to find how many pens each student will get
// and the remaining non-distributed pens.
// I/P => NONE
// O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___

class PenDistribution {
    public static void main(String[] args) {

        // Create a variable totalPens and assign 14
        int totalPens = 14;

        // Create a variable numberOfStudents and assign 3
        int numberOfStudents = 3;

        // Compute pens per student using division operator
        int penPerStudent = totalPens / numberOfStudents;

        // Compute remaining pens using modulus operator
        int remainingPens = totalPens % numberOfStudents;

        // Display the result
        System.out.println("The Pen Per Student is " + penPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}
