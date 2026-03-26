import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        // marks[i][0]=Physics, marks[i][1]=Chemistry, marks[i][2]=Maths
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        System.out.println("Enter marks (out of 100) in Physics, Chemistry, and Maths for each student:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            boolean valid = true;
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : (j == 1 ? "Chemistry" : "Maths");
                System.out.print("  " + subject + ": ");
                marks[i][j] = scanner.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("  Marks cannot be negative. Re-enter this student.");
                    i--;
                    valid = false;
                    break;
                }
            }
            if (!valid) continue;
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        System.out.println("\n--- Student Report (2D Array) ---");
        System.out.printf("%-10s %-10s %-12s %-8s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10d %-12d %-8d %-12.2f %-6s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        scanner.close();
    }
}
