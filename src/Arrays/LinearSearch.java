package Arrays;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={10, 22, 54, 38, 44};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(linearSearch(nums,target)); // function call
    }

    static int linearSearch(int[] nums, int target){
        for(int i=0; i< nums.length; i++){ // it iterates for every element of the array
            if(nums[i]==target){ // if the element matches the target, it returns the desired index
                return i;
            }
        }
        return -1; // if the element is not there in the array, it returns -1
    }
}
// time complexity = O(n), since the loop iterates n times i.e. for every element