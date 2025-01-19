package Recursion;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 9, 1, 7, 9};
        int key = 9;
        int i = 0;
        System.out.println(firstOccur(arr, key, i));
    }

    static int firstOccur(int[] arr, int key, int i){
        if(i == arr.length)
            return -1;
        if(arr[i] == key)
            return i;
        return firstOccur(arr, key, i+1);
    }
}
