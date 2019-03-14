package t1_q121_besttimetobuyandsellstock;

public class T1_BestTimetoBuyandSellStock {
    public static int maxProfit_Optimized(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if (price < minPrice) minPrice = price;
            else if (price-minPrice > maxProfit) maxProfit = price-minPrice;
        }
        return maxProfit;
    }
    public static int maxProfit_BruteForce(int[] prices){
        int maxProfit = 0;
        for (int price_buy : prices){
            for (int price_sell : prices){
                if (price_sell - price_buy > maxProfit) maxProfit = price_sell-price_buy;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        System.out.println(maxProfit_BruteForce(new int[]{7,2,5,3,7,4,1,8}));
    }
}
