package 动态规划;

public class BestTime2BuyandSellStockII122 {
    public static void main(String[] args) {
        System.out.println(new BestTime2BuyandSellStockII122().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            int i1 = prices[i] - prices[i - 1];
            if (i1 > 0) {
                count += i1;
            }
        }
        return count;
    }
}
