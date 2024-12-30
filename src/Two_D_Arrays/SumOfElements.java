package Two_D_Arrays;
import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        // taking input for the matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // for printing the matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int row = sc.nextInt();
        System.out.println("The sum of the elements of row "+row+" is: "+sum2D(matrix, rows, cols, row)); // method called
    }

    static int sum2D(int[][] matrix, int rows, int cols, int row){
        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                // if the row matches, the sum of the elements of that row will be calculated
                if(i == row){
                    sum += matrix[i][j];
                }
            }
        }
        return sum; // final sum returned
    }
}

