package FunctionsAndMethods;
import java.util.*;
public class Combination { // program for Binomial Coefficient
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoeff(n,r));
    }
    static int factorial(int n){ // although the method is called 3 times in binCoeff, it is always call by value
        int f =1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }
    static int binCoeff(int n, int r){ // basic formula is n!/[(n-r)! * r!] mathematical formula for Combination
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);
        return fact_n/(fact_nMr * fact_r);
    }
}
