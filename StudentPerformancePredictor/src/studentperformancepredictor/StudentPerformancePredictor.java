package studentperformancepredictor;

import java.util.Scanner;

public class StudentPerformancePredictor {

    public static void main(String[] args) {
        // Input: Last 10 results
        double[] results = new double[10];

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter result " + (i + 1) + ": ");
            results[i] = scanner.nextDouble();
        }

        // Predict performance using a simple linear regression model
        double predictedPerformance = predictPerformance(results);

        // Display the predicted performance
        System.out.println("Predicted Performance: " + predictedPerformance);

        // Close the scanner
        scanner.close();
    }

    // Simple linear regression model
    private static double predictPerformance(double[] results) {
        // Assuming a simple linear relationship (for illustration purposes)
        // y = m*x + b, where y is the predicted performance and x is the average of the results

        // Calculate the average of the results
        double averageResult = calculateAverage(results);

        // Linear regression coefficients (for illustration purposes)
        double slope = 0.5;
        double intercept = 50.0;

        // Predict performance
        return slope * averageResult + intercept;
    }

    // Helper method to calculate the average of an array of doubles
    private static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
