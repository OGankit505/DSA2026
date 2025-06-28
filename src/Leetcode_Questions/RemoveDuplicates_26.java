package Leetcode_Questions;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums){
        int i=0, j=1; // 2 pointer approach
        while(j<nums.length){
            if(nums[i] != nums[j]){ // unique element found
                i++;
                nums[i] = nums[j]; // store it in that position
            }
            j++; // to find unique element ahead
        }
        return i+1;
    }
}
