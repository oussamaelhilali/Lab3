package exercise4;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40, 50, 60, 70, 80},
                {11, 21, 31, 41, 51, 61, 71, 81},
                {12, 22, 32, 42, 52, 62, 72, 82},
                {13, 23, 33, 43, 53, 63, 73, 83},
                {14, 24, 34, 44, 54, 64, 74, 84},
                {15, 25, 35, 45, 55, 65, 75, 85}
        };

        System.out.println("--- Matrix before the copy");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][4] = matrix[i][1];
        }
        System.out.println("--- Matrix before the copy");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
