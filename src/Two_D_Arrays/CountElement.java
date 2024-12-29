package Two_D_Arrays;
import java.util.*;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int key = sc.nextInt();
        System.out.println("The count of "+key+" is: "+countNum(matrix, rows, cols, key));
    }

    static int countNum(int[][] matrix, int rows, int cols, int key){
        int count = 0;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == key){
                    count++; // if the element matches the key, the count increases
                }
            }
        }
        return count;
    }
}
