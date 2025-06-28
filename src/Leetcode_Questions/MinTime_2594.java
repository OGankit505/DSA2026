package Leetcode_Questions;

public class MinTime_2594 {
    public static void main(String[] args) {
        int[] ranks = {4, 2, 3, 1};
        int cars = 10;
        System.out.println(repairCars(ranks, cars));
    }

    static boolean isPossible(int[] ranks, long mid, int cars){
        long carsFixed = 0;
        for (int rank : ranks) {
            carsFixed += (long) Math.sqrt((double) mid / rank);
        }
        return carsFixed >= cars;
    }

    static long repairCars(int[] ranks, int cars){
        long l = 1;
        int maxR = Math.max(ranks[0], ranks[ranks.length-1]);
        long r = (long)maxR*cars*cars;

        long result = -1;
        while(l <= r){
            long mid = l + (r-l)/2;

            if(isPossible(ranks, mid, cars)){
                result = mid;
                r = mid -1;
            }
            else {
                l = mid + 1;
            }
        }
        return result;
    }
}
