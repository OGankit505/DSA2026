package Recursion;
import java.util.*;

public class DecOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
    static void printDecreasing(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1); // recursive function
    }
}
