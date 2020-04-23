package leetcode;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-04-23 10:31
 **/
public class Test {

    public static void main(String[] args) {
        int res[] = {1,2,3,4,5,6,7};
        System.out.println(change2nd(10, res));
    }
    public static int change2nd(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - coins[i - 1] >= 0) {
                    dp[i][j] += dp[i][j - coins[i - 1]];
                }
            }
        }
        return dp[n][amount];
    }
}
