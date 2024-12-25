package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        pairs(nums); // function called
    }
    static void pairs(int[] nums){ // distinct pairs i.e. no pairs repeated
        int totalPairs =0;
        for(int i=0;i< nums.length;i++){ // main loop
            int current = nums[i];
            for(int j=i+1; j< nums.length; j++){ // nested loop for second element
                System.out.print("("+current+","+nums[j]+") ");
                totalPairs++; // increases the count of total pairs
            }
            System.out.println();
        }
        System.out.println("The total pairs are: "+totalPairs);
    }
}
// time complexity = O(n^2), since 2 for loops are there