package Leetcode_Questions;

//import java.util.Arrays;

public class FindDuplicate_287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums){
//        Arrays.sort(nums);
//        for(int i=0; i< nums.length; i++){
//            if(nums[i] == nums[i+1]){
//                return nums[i];
//            }
//        }
//        return -1;

        // using binary search
        int low = 1;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                high = mid;  // Duplicate is in the left half
            } else {
                low = mid + 1;  // Duplicate is in the right half
            }
        }

        return low;
    }
}
