package Recursion;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 9, 1, 7, 9};
        int key = 9;
        int i = 0;
        System.out.println(lastOccur(arr, key, i));
    }

    static int lastOccur(int[] arr, int key, int i){
        if(i == arr.length)
            return -1;
        if(lastOccur(arr, key, i+1) == -1 && arr[i] == key)
            return i;
        return lastOccur(arr, key, i+1);
    }
}
