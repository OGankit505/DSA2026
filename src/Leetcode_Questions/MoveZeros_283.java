package Leetcode_Questions;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }

    static void moveZeros(int[] nums){
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != 0){
                arr[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

//int j = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] != 0) {
//int temp = nums[i];
//nums[i] = nums[j];
//nums[j] = temp;
//j++;
