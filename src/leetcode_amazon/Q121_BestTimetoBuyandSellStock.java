package leetcode_amazon;

public class Q121_BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0 ; i < prices.length-1;i++){
            if (prices[i] < prices[i+1]) min = Math.min(min,i);
            else if (prices[i]>prices[i+1]) maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
