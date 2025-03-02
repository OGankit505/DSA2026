package Two_D_Arrays;
import java.util.*;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                         {9,10,11,12},
                        {13,14,15,16}};

        int key = sc.nextInt();
        staircaseSearch(matrix, key);
    }

    static void staircaseSearch(int[][] matrix, int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("key found at ("+row+","+col+")");
                return;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
    }
}
