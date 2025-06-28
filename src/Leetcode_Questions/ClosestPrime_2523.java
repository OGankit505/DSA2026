package Leetcode_Questions;

import java.util.*;
public class ClosestPrime_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(Arrays.toString(closestPrimes(left, right)));
    }

    public static int[] closestPrimes(int left, int right){
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (int i = left; i <= right; i++) {
            if (ans[1] - ans[0] == 2 || ans[1] - ans[0] == 1)
                break;
            if (isPrime(i)) {
                if (ans[0] == -1)
                    ans[0] = i;
                else if (ans[1] == -1)
                    ans[1] = i;
                else {
                    ans[0] = ans[1];
                    ans[1] = i;
                }
            }
        }
        if (ans[0] == -1 || ans[1] == -1)
            return new int[] { -1, -1 };
        return ans;
    }

    public static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
