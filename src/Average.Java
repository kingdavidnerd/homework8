import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;

    // Constructor
    public Average() {
        data = new int[5]; // Allocate memory for 5 scores
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score number " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }
        selectionSort();
        calculateMean();
    }

    // Method to calculate the mean
    public void calculateMean() {
        int sum = 0;
        for (int score : data) {
            sum += score;
        }
        mean = (double) sum / data.length;
    }

    // Method to convert the array data to a String format
    public String toString() {
        StringBuilder result = new StringBuilder("Scores in descending order: ");
        for (int score : data) {
            result.append(score).append(" ");
        }
        result.append("\nMean: ").append(mean);
        return result.toString();
    }

    // Selection sort to sort the array in descending order
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = data[maxIdx];
            data[maxIdx] = data[i];
            data[i] = temp;
        }
    }
}