package Arrays;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);

    }
    static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i=0;i< nums1.length;i++){
            for(int j=0; j<nums2.length;j++){
                if(nums1[i]==0){
                    nums1[i]=nums2[j];
                }
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
