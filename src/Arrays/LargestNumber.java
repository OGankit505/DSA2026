package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {10,22,36,64,44,55,18,9};
        System.out.println("The largest number is: "+largestNum(nums));
    }

    static int largestNum(int[] nums){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) { // enhanced for loop
            if (num > largest) { // condition for Largest number
                largest = num;
            }
            if (num < smallest){ // condition for Smallest number
                smallest = num;
            }
        }
        System.out.println("The smallest number is: "+smallest);
        return largest;
    }
}
