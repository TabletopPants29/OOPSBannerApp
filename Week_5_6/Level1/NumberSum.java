import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (enter 0 or a negative number to stop, max 10 numbers):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nSum of all numbers: " + total);

        scanner.close();
    }
}
