package Two_D_Arrays;
import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transposeMatrix(matrix, rows, cols);
    }

    static void transposeMatrix(int[][] matrix, int rows, int cols){
        System.out.println("The transposed matrix is:");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
