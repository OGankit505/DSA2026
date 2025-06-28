package Leetcode_Questions;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,2,2};
        System.out.println(majorElement(nums));
    }

    static int majorElement(int[] nums){
        int count = 1;
        int major = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                major = nums[i];
                count = 1;
            } else if (nums[i] == major) {
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }
}
