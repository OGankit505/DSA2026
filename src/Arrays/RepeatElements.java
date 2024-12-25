package Arrays;

public class RepeatElements {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(repeat(nums));
    }

    static boolean repeat(int[] nums){
        int count=1;  // considering that element is there at least once
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]==nums[i]){ // if the elements are same, count increases
                    count++;
                }
            }
        }
        return count >= 2; // if condition is satisfied, returns true else returns false
    }
}

// time complexity = O(n^2)