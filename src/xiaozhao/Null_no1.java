package xiaozhao;

public class Null_no1 {
	public static void main(String[] args) {
		int[] nums = { 6, 0, 8, 2, 1, 5 };
		int n = 6;
		System.out.println(test(n, nums));
	}

	private static int test(int n, int[] nums) {
		int len = nums.length;
		int[][] dp = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (nums[i] <= nums[j]) {
					dp[i][j] = j - i;
				}
			}
		}
		int res = -1;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (dp[i][j] > res) {
					res = dp[i][j];
				}
			}
		}
		return res;
	}
}
