package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14};
        int target = 10;
        System.out.println(binarySearch(nums,target));
    }

    static int binarySearch(int[] nums, int target){
        int start =0;
        int end= nums.length-1;

        while(start <= end){
           int mid = start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){ // searching on the right side of array
                start=mid+1;
            }
            else{   // searching on the left side of array
                end=mid-1;
            }
        }
        return -1; // if target doesn't exist
    }
}
// time complexity = O(log n)
