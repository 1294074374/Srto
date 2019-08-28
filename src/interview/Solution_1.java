package interview;

public class Solution_1 {
	public int search(int[] nums, int target) {
		int res = -1;
		if (nums.length == 0) {
			return res;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Solution_1 s = new Solution_1();
		int[] nums = {};
		int target = 2;
		System.out.println(s.search(nums, target));
	}
}
