package at.htl;

import java.util.Scanner;

public class SortComplexity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountArrays = 0, arraySize = 0, i = 0;
        long time, allTime = 0;

        //EIN-/AUSGABE
        System.out.printf("%nAnzahl der zu sortierenden Arrays: ");
        amountArrays = scanner.nextInt();

        System.out.printf("Größe der Arrays: ");
        arraySize = scanner.nextInt();
        System.out.printf("");

        //AUFRUF VON SORT RADNOM ARRAY
        for (i = 0; i < amountArrays; i++) {
            time = sortRandomArray(arraySize);
            allTime += time;
            System.out.printf("%nLaufzeit zur sortierung des %d. Arrays: %dms" , i+1,time);
        }

        System.out.printf("%nDurchschnittszeit: %dms %n", allTime/i);

        

    }

    // Sorts an array of random numbers and returns the sorting run time in ms
    public static long sortRandomArray(int length) {

        int[] array = generateRandomArray(length);

        long before = System.currentTimeMillis();
        sort(array);
        long after = System.currentTimeMillis();


        return after - before;
    }

    // Returns an array of random numbers
    public static int[] generateRandomArray(int length) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (0 - 100)) + 100;
        }

        return array;
    }

    // Sorts an array of numbers in ascending order
    public static void sort(int[] array) {


        boolean getauscht;


        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j; i < array.length; i++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }

    }

    // Swaps the array elements with index i and j
    public static void swap(int[] array, int i, int j) {
        char hilf;

        hilf = (char) array[i];
        array[i] = array[j];
        array[j] = hilf;


    }
}
