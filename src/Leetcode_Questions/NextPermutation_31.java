package Leetcode_Questions;

public class NextPermutation_31 {
    public static void main(String[] args) {

    }

//    static int nextPermutation(int[] nums){
//        int currIndex = -1;
//
//        for(int i= nums.length-1; i>0; i--){
//            if(nums[i]>nums[i-1]){
//                currIndex = i-1;
//                break;
//            }
//        }
//        if(currIndex!=-1){
//            int swapIndex = currIndex;
//
//            for(int j= nums.length-1; j>=currIndex+1; j--){
//                if(nums[j]>nums[currIndex]){
//                    swapIndex = j;
//                    break;
//                }
//            }
//            int temp = nums[currIndex];
//            nums[currIndex] = nums[swapIndex];
//            nums[swapIndex] = temp;
//        }
//        return currIndex;
}

