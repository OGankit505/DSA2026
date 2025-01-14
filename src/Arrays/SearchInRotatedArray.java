package Arrays;

import java.util.Scanner;
/* Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums. */

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
