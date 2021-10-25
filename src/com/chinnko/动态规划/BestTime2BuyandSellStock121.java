package 动态规划;

public class BestTime2BuyandSellStock121 {
    public static void main(String[] args) {
        System.out.println(new BestTime2BuyandSellStock121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int minValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - minValue);
            minValue = Math.min(prices[i], minValue);
        }
        return max;
    }
    }
}
