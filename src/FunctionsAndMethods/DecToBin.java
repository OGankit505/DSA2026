package FunctionsAndMethods;
import java.util.*;

public class DecToBin { // Decimal to Binary
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal value: ");
        int n = sc.nextInt();
        System.out.print("the binary value is: "+dectoBin(n));
    }

    static int dectoBin(int n){
        int rem, bin =0, power=0;
        while(n!=0){
            rem = n%2;
            bin = bin + (rem * (int) Math.pow(10,power));
            n=n/2;
            power++;
        }
        return bin;
    }
}
