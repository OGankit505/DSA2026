package Arrays;
public class SubArrays {
    public static void main(String[] args) {
        int[] nums={1,3,5,7,9};
        subArrays(nums);
    }
    static void subArrays(int[] nums){ // sub arrays - a continuous part of an array
        //this for loop is for the starting element of the sub arrays
        for(int i=0; i< nums.length; i++){

            //this for loop is the ending element of the sub arrays
            for(int j=i; j< nums.length; j++){

                // this for loop is for putting together the start and end
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
