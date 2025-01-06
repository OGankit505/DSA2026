package Strings;
import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next(); // the directions form origin to the destination
        System.out.println("The shortest path is: "+shortestPath(path));

    }

    static float shortestPath(String path){ // here we are calculating the shortest path to reach the destination i.e. displacement
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir =  path.charAt(i); // direction
            // north
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }                                                        //   __________
        return (float) Math.sqrt(Math.pow(x,2) + Math.pow(y,2)); // \/ x^2 + y^2 = formula
    }
}
