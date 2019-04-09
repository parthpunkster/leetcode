package leetcode_amazon;

public class Q42_TrappingRainWater {
    public static int trap(int[] height){
        if(height == null || height.length == 0) return 0;
        int[] maxFromLeft = new int[height.length];
        int[] maxFromRight = new int[height.length];

        maxFromLeft[0] = height[0];
        maxFromRight[height.length-1] = height[height.length-1];
        for (int i = 1 ; i<height.length;i++) maxFromLeft[i] = Math.max(height[i],maxFromLeft[i-1]);
        for(int j = height.length-2;j>=0;j--) maxFromRight[j] = Math.max(height[j],maxFromRight[j+1]);

        int sum = 0;
        for (int i = 0 ; i<height.length;i++){
            sum += Math.min(maxFromLeft[i],maxFromRight[i]) - height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
