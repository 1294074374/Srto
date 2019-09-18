package leetcode.no999_;

public class No1124_Solution_表现良好的最长时间段_dp {
	public static void main(String[] args) {
		No1124_Solution_表现良好的最长时间段_dp n = new No1124_Solution_表现良好的最长时间段_dp();
		int[] hours = {9,9,6,0,6,6,9};
		System.out.println(n.longestWPI(hours));
	}

	public int longestWPI(int[] hours) {
		if (hours.length == 0) {
			return 0;
		}
		int len = hours.length;
		int[][] dp = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				dp[i][j] = check(hours, i, j);
			}
		}
		int res = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (res < dp[i][j]) {
					res = dp[i][j];
				}
			}
		}
		return res;
	}

	private int check(int[] hours, int i, int j) {
		int max = 0;
		int min = 0;
		if (i == j) {
			if (hours[i] <= 8) {
				return 0;
			} else {
				return 1;
			}
		}
		for (int k = i; k <= j; k++) {
			if (hours[k] <= 8) {
				min++;
			} else {
				max++;
			}
		}
		if (max > min) {
			return j - i +1;
		}
		return 0;
	}
}
