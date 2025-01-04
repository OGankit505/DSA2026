package Two_D_Arrays;

import java.util.*;

public class DiagonalSum {
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

        System.out.println(sumDiagonal(matrix));
    }

    static int sumDiagonal(int[][] matrix){
//        // brute force approach
//        int sum = 0;
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; j++){
//                //primary diagonal
//                if(i == j){
//                    sum+=matrix[i][j];
//                }
//                //secondary diagonal
//                else if(i+j == matrix.length-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

        // optimized approach
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            // primary diagonal
            sum+=matrix[i][i];
            // secondary diagonal
            if(i != matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
}
