package t1_q122_besttimetobuyandsellstockII;

public class T1_BestTimetoBuyandSellStockII {
    public static int maxProfit_OnePass(int[] prices){
        if (prices.length == 0) return 0;
        int maxProfit = 0;
        int valley = prices[0];
        int peak = prices[0];
        int i = 0;
        while (i < prices.length-1){
            while (i<prices.length-1 && prices[i] >= prices[i+1]) i++;
            valley = prices[i];
            while (i < prices.length-1 && prices[i] <= prices[i+1]) i++;
            peak = prices[i];
            maxProfit += peak-valley;
            i++;
        }
        return maxProfit;
    }

    public static int maxProfit_SingleOnePass(int[] prices){
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    public static void main(String[] args){
        System.out.println(maxProfit_SingleOnePass(new int[]{1,2,3,4,5}));
    }
}
