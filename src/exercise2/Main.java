package exercise2;

public class Main {
    public static void reverse(int[] array) {
        System.out.print("Array before reverse: [");
        for (int j : array) {
            System.out.print(j);
            if (j != array[array.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println("]\n");

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        System.out.print("Array after reverse: [");
        for (int j : array) {
            System.out.print(j);
            if (j != array[array.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        reverse(array);
    }
}
