package Arrays;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12};
        System.out.println("The original array: "+Arrays.toString(nums));
        reverseArr(nums);
        System.out.println("The reversed array: "+Arrays.toString(nums));
    }
    static void reverseArr(int[] nums){
        int first =0, last =nums.length-1; // two pointer approach i.e. first and last

        while(first<last){
            int temp = nums[last];    // general method for swapping using third variable
            nums[last] = nums[first];
            nums[first] = temp;

            first++; // first index getting incremented
            last--;  // last index getting decremented
        }
    }
}
