package leetcode.no100_199;

public class No198_Solution_打家劫舍 {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		int singular = 0;
		int dual = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				dual += nums[i];
			} else {
				singular += nums[i];
			}
		}
		return Math.max(singular, dual);
	}

	public int rob_dp(int[] nums) {
			int a = 0;
			int b = 0;
			for (int i = 0; i < nums.length; i++) {
				int t = b;
				b = Math.max(a + nums[i], b);
				a = t;
			}
			return b;
	}

	public static void main(String[] args) {
		No198_Solution_打家劫舍 n = new No198_Solution_打家劫舍();
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(n.rob_dp(nums));

	}
}