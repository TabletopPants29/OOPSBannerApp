import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // personData[i][0] = weight, [i][1] = height, [i][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        System.out.println("Enter weight (kg) and height (m) for each person:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            while (true) {
                System.out.print("  Weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("  Please enter a positive weight.");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.print("  Height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("  Please enter a positive height.");
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report (2D Array) ---");
        System.out.printf("%-10s %-12s %-10s %-10s %-15s%n",
                "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-10.2f %-10.2f %-15s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
