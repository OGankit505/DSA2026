package Arrays;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissing(nums));
    }

    // not the correct approach
    static int firstMissing(int[] nums){
        Arrays.sort(nums);
        int miss = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] == i+1){
                miss = i-1;
            }
        }
        return miss;
    }
}
