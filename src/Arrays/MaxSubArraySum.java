package Arrays;

/* The concept here is that if any element of the array is negative, it is made zero rather than taking a negative number.
If the number is positive the max sum gets updated, everytime but only for positive values. At the end it will give the
max sum which is from the sub array only, which can be verified via dry run.

It has got 2 more approaches, brute force and Prefix sum approach, but they are having time complexities O(n^3) and O(n^2)
respectively. So Kadane's algorithm is the most optimized approach and its time complexity is O(n).
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadane(nums));
    }
    static int kadane(int[] nums){  // This Kadane's algorithm for calculating the max sum of subarrays
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i< nums.length;i++){
            currSum+=nums[i];

            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
