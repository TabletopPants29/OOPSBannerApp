import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        System.out.println("Enter weight (kg) and height (m) for each person:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("  Height (m): ");
            height[i] = scanner.nextDouble();
        }

        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-12s %-10s %-10s %-15s%n",
                "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-10.2f %-10.2f %-15s%n",
                    (i + 1), weight[i], height[i], bmi[i], weightStatus[i]);
        }

        scanner.close();
    }
}
