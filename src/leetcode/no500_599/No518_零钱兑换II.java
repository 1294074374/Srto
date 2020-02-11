package leetcode.no500_599;

public class No518_��Ǯ�һ�II {

	public int change(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int coin : coins) {
			for (int x = coin; x < amount + 1; ++x) {
				dp[x] += dp[x - coin];
			}
		}
		return dp[amount];
	}
}
