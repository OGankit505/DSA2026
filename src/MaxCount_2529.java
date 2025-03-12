public class MaxCount_2529 {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));
    }

    static int maximumCount(int[] nums){
        int count1=0;
        int count2=0;
        for (int num1 : nums) {
            if (num1 > 0) {
                count1++;
            } else if (num1 < 0) {
                count2++;
            }
        }
        return Math.max(count1, count2);
    }
}
