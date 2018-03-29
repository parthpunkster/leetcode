package q121_besttimetobuyandsellstock;

import java.util.ArrayList;
import java.util.Arrays;

import punksterutils.ArrayUtilities;
import punksterutils.ArrayUtilities.*;


public class Main {

    public static int maxProfit(int[] prices){
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i<prices.length;i++){
            if (prices[i] < min){
                min = prices[i];
            }
            else if (prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }
}
