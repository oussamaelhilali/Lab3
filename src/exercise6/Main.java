package exercise6;

public class Main {
    public static int median(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[i];
                    sortedArr[i] = temp;
                }
            }
        }
        int median = sortedArr.length / 2; // if sortedArr.length is odd then the half of it will be transformed to int as I declare the variable as int not float
        return sortedArr[median];
    }
    public static void main(String[] args) {
        // Exemples de tableaux donnés dans l'énoncé
        int[] array1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] array2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};

        // Test et affichage des médianes
        System.out.println("Médiane du tableau 1 : " + median(array1));
        System.out.println("Médiane du tableau 2 : " + median(array2));
    }

}
