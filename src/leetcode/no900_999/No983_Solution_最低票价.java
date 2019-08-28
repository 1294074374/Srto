package leetcode.no900_999;

public class No983_Solution_最低票价 {
	public int mincostTickets(int[] days, int[] costs) {
		int[] dp = new int[365];
		// 第0天花费为0
		dp[0] = 0;
		// 日 月 年的花费
		int dayTicker = costs[0];
		int weekTicker = costs[1];
		int monthTicker = costs[2];
		// days的下标，确保遍历365天时，以便于知道下次旅游的日期。
		int dayIdx = 0;
		for (int today = 1; today <= 365; today++) {
			if (dayIdx > days.length) {
				break;
			}
			// 今天不是旅游日 则费用仍是昨天的费用
			if (today != days[dayIdx]) {
				dp[today] = dp[today - 1];
				continue;
			}
			// 等待下一个旅游日
			dayIdx++;
			// 到旅游日了
			// 看买月票是否便宜
			// 或者看周票
			// 是在不行就用这日票呗
			dp[today] = Math.min(
					Math.min(dp[Math.max(0, today - 1)] + dayTicker, dp[Math.max(0, today - 7)] + weekTicker),
					dp[Math.max(0, today - 30)] + monthTicker);
		}
		return dp[days[days.length-1]];
	}
}
