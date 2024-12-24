package FunctionsAndMethods;
import java.util.*;
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        int m = sc.nextInt();
        rangePrime(m);
    }
    static boolean isPrime(int n){
//        for (int i = 2; i <= n - 1; i++) { general approach, but here factors are getting repeated for the number

        for (int i =2; i <= Math.sqrt(n); i++){ // optimized approach
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void rangePrime(int m){ // this function will give the range of numbers which are prime
        for(int i=2; i<=m; i++){
            if(isPrime(i)){ // we have used the isPrime method for checking the condition
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
