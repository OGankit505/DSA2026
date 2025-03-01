import java.util.*;

public class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Square root of "+x+" is: "+sqrt(x));
        int y = sc.nextInt();
        System.out.println("Cube root of "+y+" is: "+cubrt(y));
    }
    static int sqrt(int x){
        return (int)Math.abs(Math.sqrt(x));
    }
    static int cubrt(int y){
        return (int)Math.abs(Math.cbrt(y));
    }
}
