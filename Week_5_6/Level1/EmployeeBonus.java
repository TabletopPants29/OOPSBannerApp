import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees (Zara):");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            while (true) {
                System.out.print("  Salary: ");
                salary[i] = scanner.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("  Invalid salary. Please enter a positive value.");
                    i--;
                    break;
                }
                System.out.print("  Years of Service: ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("  Invalid years of service. Please enter a non-negative value.");
                    i--;
                    break;
                }
                break;
            }
        }

        System.out.println("\n--- Bonus Report (Zara) ---");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n",
                "Employee", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];

            System.out.printf("%-10d %-12.2f %-12.1f %-12.2f %-12.2f%n",
                    (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary:   %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary:   %.2f%n", totalNewSalary);

        scanner.close();
    }
}
