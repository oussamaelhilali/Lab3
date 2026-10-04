package exercise3;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        int count = 1;
        int line = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < line; j++) {
                arr[i][j] = count++;
            }
            line++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (arr[i][j] != arr[i][arr[i].length - 1]) {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }
    }
}
