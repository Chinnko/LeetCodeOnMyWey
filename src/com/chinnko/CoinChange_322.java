import org.w3c.dom.ranges.Range;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CoinChange_322 {

    private int[] mounts;

    public static void main(String[] args) {

        CoinChange_322 coinChange_322 = new CoinChange_322();
        System.out.println(coinChange_322.coinChange(new int[]{1, 2, 5}, 100));
    }
    private int[] mounts;
    public int coinChange(int[] coins, int amount) {
        mounts = new int[amount + 1];
        Arrays.fill(mounts, -111);
        return ma(coins, amount);
    }

    public int ma(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;
        if (mounts[amount] != -111)
            return mounts[amount];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int i = ma(coins, amount - coin);
            if (i == -1) continue;
            min = Math.min(min, i + 1);

        }
        mounts[amount] = min == Integer.MAX_VALUE ? -1 : min;
        return mounts[amount];
    }
}
