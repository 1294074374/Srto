package leetcode.no400_499;

import java.util.Arrays;

public class No453_Solution_最小移动次数使数组元素相等 {
	public int minMoves(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = nums.length - 1; i > 0; i--) {
			res += nums[i] - nums[0];

		}
		return res;
	}

	public static void main(String[] args) {
		No453_Solution_最小移动次数使数组元素相等 s = new No453_Solution_最小移动次数使数组元素相等();
		int[] nums = { 1, 2, 3 };
		System.out.println(s.minMoves(nums));
	}
}
