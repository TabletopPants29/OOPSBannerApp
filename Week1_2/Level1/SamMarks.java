// Level 1 - Problem 2
// Sam's mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100.
// Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam's average mark in PCM is ___

class SamMarks {
    public static void main(String[] args) {

        // Create variables for each subject marks
        String name = "Sam";
        double mathsMark = 94;
        double physicsMark = 95;
        double chemistryMark = 96;

        // Total marks and max marks
        int numberOfSubjects = 3;

        // Compute average percent marks
        double averageMark = (mathsMark + physicsMark + chemistryMark) / numberOfSubjects;

        // Display the result
        System.out.println(name + "'s average mark in PCM is " + averageMark);
    }
}
