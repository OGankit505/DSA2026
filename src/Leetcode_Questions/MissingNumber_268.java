package Leetcode_Questions;


public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(findMissing(nums));
    }

    static int findMissing(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}

