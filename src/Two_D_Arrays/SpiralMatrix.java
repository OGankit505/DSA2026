package Two_D_Arrays;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        printSpiral(matrix); // method called
    }
     // method spiral matrix
    static void printSpiral(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top part of the matrix
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right part of the matrix
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom part of the matrix
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left part of the matrix
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
}
/* the matrix is:
               top part
             _ _ _ _ _ _ _                       the output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
            | 1  2  3  4 |
            | 5  6  7  8 |
  left part | 9 10 11 12 | right part
            |13 14 15 16 |
             _ _ _ _ _ _ _
              bottom part
 */