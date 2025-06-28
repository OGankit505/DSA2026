package Arrays;

public class MaximisingCardboards {
    public static void main(String[] args) {
        int[] arr = {2,1,1,2,1,1};
        System.out.println(cardboards(arr));
    }
    static int cardboards(int[] arr){
        int count=0;
        int countSqr=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            if(count == 4){
                countSqr++;
            }
        }
        return countSqr;
    }
}
