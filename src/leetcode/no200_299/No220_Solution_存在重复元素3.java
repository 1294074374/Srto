package leetcode.no200_299;

public class No220_Solution_存在重复元素3 {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		for (int i = 0; i < nums.length; ++i) {
			for (int j = Math.max(i - k, 0); j < i; ++j) {
				if (Math.abs(nums[i] - nums[j]) <= t)
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		No220_Solution_存在重复元素3 n = new No220_Solution_存在重复元素3();
		int[] nums = { 0 };
		int k = 0;
		int t = 0;
		System.out.println(n.containsNearbyAlmostDuplicate(nums, k, t));
	}
}
