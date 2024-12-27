package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        bubble(nums);
        printBubble(nums);

    }
    static void bubble(int[] nums){
        for(int i=0; i< nums.length-1; i++){
            for(int j=0; j< nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    static void printBubble(int[] nums){
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
