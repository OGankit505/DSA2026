package Leetcode_Questions;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    static void sortColors(int[] nums){
        int count0 = 0, count1 = 0, count2 = 0;
        for(int num : nums){
            if(num==0){
                count0++;
            }
            else if(num==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0; i<count0; i++){
            nums[i] = 0;
        }
        for(int i = count0; i<count0+count1; i++){
            nums[i] = 1;
        }
        for(int i = count0+count1; i< nums.length; i++){
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
