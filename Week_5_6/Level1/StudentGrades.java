import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        // marks[i][0]=Physics, [i][1]=Chemistry, [i][2]=Maths
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        System.out.println("Enter marks (out of 100) in Physics, Chemistry, and Maths for each student:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            while (true) {
                System.out.print("  Physics: ");
                physics[i] = scanner.nextInt();
                if (physics[i] < 0) { System.out.println("  Marks cannot be negative."); i--; break; }
                System.out.print("  Chemistry: ");
                chemistry[i] = scanner.nextInt();
                if (chemistry[i] < 0) { System.out.println("  Marks cannot be negative."); i--; break; }
                System.out.print("  Maths: ");
                maths[i] = scanner.nextInt();
                if (maths[i] < 0) { System.out.println("  Marks cannot be negative."); i--; break; }
                break;
            }
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-12s %-8s %-12s %-6s%n",
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10d %-12d %-8d %-12.2f %-6s%n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        scanner.close();
    }
}
