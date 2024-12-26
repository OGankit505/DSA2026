package Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapped(height));
    }

    static int trapped(int[] height){
        int n = height.length;

        //calculating the left max boundary
        int[] leftMax=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //calculating the right max boundary
        int[] rightMax=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        // loop for trapping the rainwater
        for(int i=0; i<n; i++){
            // water level = min(leftmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
