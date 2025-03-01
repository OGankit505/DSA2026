package Arrays;

import java.util.Arrays;
// problem of the day
public class Operations_2460 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }

    static int[] applyOperations(int[] nums){
        int start = 0;
        for(int i=0; i< nums.length-1; i++)
        {
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        for(int num : nums){
            if (num!=0){
                nums[start++] = num;
            }
        }
        while (start < nums.length){
            nums[start++] = 0;
        }
        return nums;
    }
}
