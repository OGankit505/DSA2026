package Leetcode_Questions;

public class MaxSubarray_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));
    }

    static int maxSubarray(int[] nums){
        //Kadane's Algorithm
        int currSum = 0 ;
        int maxSum = nums[0];

        for(int num : nums){
            currSum+=num;
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}

//time complexity : O(N)
