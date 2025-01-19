package Recursion;
import java.util.*;

public class PowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long n = sc.nextInt();
        System.out.println(powerOfN(a, n));
    }

    static long powerOfN(long a, long n){
        if(n == 0)
            return 1;

        long halfPower = powerOfN(a, n/2);
        // condition for odd number
        if(n%2 != 0)
            return a * halfPower * halfPower;

        return halfPower * halfPower;
    }
}
