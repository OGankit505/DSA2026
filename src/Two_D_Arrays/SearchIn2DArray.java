package Two_D_Arrays;
import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int rows = 3;
        int cols = 3;

        // taking input inside the matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // to print the matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int key = sc.nextInt();
        System.out.println(search(matrix, rows, cols, key));// method called
    }

    // to search an element in 2D array
    static boolean search(int[][] matrix, int rows, int cols, int key){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == key){
                    System.out.println(key+" is found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
}
