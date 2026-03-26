import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];

        System.out.println("Enter the heights of 11 football team players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;
        System.out.printf("\nMean height of the football team: %.2f cm%n", mean);

        scanner.close();
    }
}
