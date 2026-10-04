package exercise5;

public class Main {
    public static int[][] matrixAdd(int[][] arrA, int[][] arrB) {
        int rows = arrA.length;
        int cols = arrA[0].length;
        int[][] arrC = new int[rows][cols];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
        return arrC;
    }

    public static void main(String[] args) {
        int[][] arrA = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int[][] arrB = {
                {4, 5, 6, 7},
                {10, 12, 3, 4}
        };
        int[][] sum = matrixAdd(arrA, arrB);

        System.out.println("The sum is: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
