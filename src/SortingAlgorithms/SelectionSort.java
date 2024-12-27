package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        selection(nums);
        printSelection(nums);

    }
    static void selection(int[] nums){ // min element from unsorted array is taken and placed at front
        for(int i=0; i< nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j< nums.length; j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
    static void printSelection(int[] nums){
        for(int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
// time complexity - O(n^2)