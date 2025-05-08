package Arrays;
import java.util.*;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {10,5,10};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[] arr){
        Arrays.sort(arr);

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
