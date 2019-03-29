package at.htl;

import java.util.Scanner;

public class SortComplexity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountArrays = 0, arraySize = 0;

        System.out.printf("%nAnzahl der zu sortierenden Arrays: ");
        amountArrays = scanner.nextInt();

        System.out.println();
        System.out.printf("Größe der Arrays: ");
        arraySize = scanner.nextInt();

        for (int i = 0; i < amountArrays; i++) {

            sortRandomArray(arraySize);
            
        }

        

    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {

        int[] array = new int[length];
        boolean switched;
        int i = array.length - 1;

        for (int x = 0; x <= length; i++) {
            array[i] = (int) (Math.random() * (0 - 100)) + 100;
        }

        do {
            switched = false;

            for (int j = 0; j < i; i++) {
                if (array[j] > array[j+1]) {
                    int help = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = help;
                    switched = true;
                }
            }
            i--;
        } while (switched || (i >= 0));


        return 0;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {
        return null;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {

    }

    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {

    }
}
