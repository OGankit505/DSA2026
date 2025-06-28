package Leetcode_Questions;

import java.util.Arrays;

// problem of the day
public class Merge2D_2570 {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2}, {2,3}, {4,5}};
        int[][] nums2 = {{1,4}, {3,2}, {4,1}};
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));

    }
    static int[][] mergeArrays(int[][] nums1, int[][] nums2){
        int rows = nums1.length;
        int cols = nums1[0].length;

        int[][] merged = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(nums1[i] == nums2[i]){
                    merged[i][j] = nums1[i][j] + nums2[i][j];
                }
            }
        }
        return merged;
    }
}
