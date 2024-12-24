package FunctionsAndMethods;
import java.util.*;

public class BinToDec { // Binary to Decimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary value: ");
        int n = sc.nextInt();
        System.out.print("The decimal value is: "+bintoDec(n));
    }

    static int bintoDec(int n){
        int rem, dec=0, power=0;
        while(n!=0){
            rem = n%10;
            dec = dec + (rem * (int) Math.pow(2,power)); // type casting double into integer
            n = n/10;
            power++;
        }
        return dec;
    }
}
