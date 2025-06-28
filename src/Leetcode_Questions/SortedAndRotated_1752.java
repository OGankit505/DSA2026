package Leetcode_Questions;

public class SortedAndRotated_1752 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }

    static boolean check(int[] nums){
        int[] arr = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            int index = 0;
            for(int j=i; j< nums.length; j++){
                arr[index] = nums[i];
                index++;
            }

            boolean isSorted = true;
            for(i=0; i< nums.length; i++){
                if(nums[i] > nums[i+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted){
                return true;
            }
        }
        return false;
    }
}
