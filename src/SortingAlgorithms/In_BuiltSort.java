package SortingAlgorithms;
//import java.util.*; - we can use this also, instead of importing both separately
import java.util.Arrays; // for ascending order
import java.util.Collections; // for descending order

public class In_BuiltSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        System.out.print("Ascending order sorted array: ");
        printArr(arr);

        // for descending order, wrapper class is used instead of primitive data types for the array i.e. Integer for int
        Integer[] arr1 = {5, 4, 1, 3, 2};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.print("Descending order sorted array: ");
        printArr(arr1);

    }

    static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void printArr(Integer[] arr1) {
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
