package Leetcode_Questions;

import java.util.Arrays;

public class EqualPairs_2206 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));

    }
    static boolean divideArray(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1; i<nums.length; i+=2){
            if(nums[i-1]==nums[i]){
                count++;
            }
        }
        return count == nums.length / 2;
    }
}
