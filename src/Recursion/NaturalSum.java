package Recursion;
import java.util.*;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of first "+n+" natural numbers is: "+sumNatural(n));

    }
    static int sumNatural(int n){
        if(n == 1)
            return n;
        return n + sumNatural(n-1);
    }
}
