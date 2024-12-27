package Arrays;

public class BestSightseeingPair {
    public static void main(String[] args) {
        int[] values = {1,2};
        System.out.println(maxScoreSightseeingPair(values));
    }
    static int maxScoreSightseeingPair(int[] values){
        int max;
        int max1 = 0;
        for(int i=0; i< values.length;i++){
            for(int j=i+1; j< values.length;j++){
                if(i<j){
                    max = values[i] + values[j] + i - j;
                    max1 = Math.max(max, max1);
                }
            }
        }
        return max1;
    }
}
// not the perfect answer for leetcode, time limit exceeds 50/55 test cases passed

/*
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int bestLeft = values[0]; // The best "values[i] + i" seen so far

        for (int j = 1; j < values.length; j++) {
            // Compute the score for the current pair
            maxScore = Math.max(maxScore, bestLeft + values[j] - j);

            // Update the best "values[i] + i" for future pairs
            bestLeft = Math.max(bestLeft, values[j] + j);
        }

        return maxScore;
    }
}
 */