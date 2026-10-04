package exercise7;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        double ans = stdev(arr);
        System.out.println("Standard deviation: " + String.format("%.3f", ans));
    }

    public static double stdev(int[] arr) {
        // The average of the element of arr
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;

        double numerator = 0;
        for (int i = 0; i < arr.length; i++) {
            numerator += Math.pow(arr[i] - avg, 2);
        }
        double ans = Math.sqrt((numerator / (arr.length - 1)));

        return ans;
    }
}
