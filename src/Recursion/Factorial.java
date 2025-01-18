package Recursion;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is: "+numFactorial(n));

    }

    static int numFactorial(int n){
        if(n == 0 || n==1)
            return 1;
        return n * numFactorial(n-1);
    }
}
