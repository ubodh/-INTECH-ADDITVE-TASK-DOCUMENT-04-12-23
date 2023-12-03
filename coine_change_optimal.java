
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class coine_change_optimal {

    public static List<Integer> find_Optimal_Change(int[] coins, int target) {
        int[] dp = new int[target + 1];
        int[] prev = new int[target + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= target; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                    prev[i] = coin;
                }
            }
        }

        List<Integer> change = new ArrayList<>();
        int current = target;
        while (current > 0) {
            change.add(prev[current]);
            current -= prev[current];
        }

        return change;
    }

    public static void main(String[] args) {
        int[] available_Coins = {1, 2, 5, 8, 10};
        int change = 7;

        List<Integer> optimalChange = find_Optimal_Change(available_Coins, change);

        // Reverse the list to get the coins in ascending order
        Collections.reverse(optimalChange);

        System.out.println("Optimal change coins: " + optimalChange);
    }
}
