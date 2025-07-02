package Leetcode_Questions;

import java.util.Arrays;

public class RearrangeBySign_2149 {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    static int[] rearrangeArray(int[] nums){
        int[] arr = new int[nums.length];
        int i=0, j=1; //two pointer approach

        for(int num : nums){
            if(num > 0){
                arr[i] = num;
                i+=2; // for positive numbers
            }
            else{
                arr[j] = num;
                j+=2; // for negative numbers
            }
        }
        return arr; // resultant array after changes
    }
}
