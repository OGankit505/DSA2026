package Recursion;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci number is: "+fibo(n));
    }

    static int fibo(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
