package leetcode;

import com.sun.scenario.animation.shared.ClipEnvelope;

class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length ==0){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }else if(prices[i]-minPrice >maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
