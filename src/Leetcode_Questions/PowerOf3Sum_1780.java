package Leetcode_Questions;

import java.util.*;
// problem of the day

public class PowerOf3Sum_1780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowersOfThree(n));
    }
    static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n = n/3;
        }
        return true;

        // String base3 = Integer.toString(n, 3);
        //
        //        return !base3.contains("2");
    }
}
