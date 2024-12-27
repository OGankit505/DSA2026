package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 2, 3};
        insertion(nums);
        printInsertion(nums);
    }
     static void insertion(int[] nums){
        for(int i=1; i< nums.length; i++){
            int current = nums[i];
            int previous = i-1;
            // loop for finding out the correct position to insert
            while(previous>=0 && nums[previous] > current){
                nums[previous+1]=nums[previous];
                previous--;
            }
            // insertion
            nums[previous+1] = current;
        }
     }
     static void printInsertion(int[] nums){
        for(int num : nums){
            System.out.print(num+" ");
        }
         System.out.println();
     }
}
