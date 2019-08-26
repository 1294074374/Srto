
/**
 * 给定�?个包括 n 个整数的数组 nums �? �?个目标�?� target。找出 nums 中的三个整数�?
 * 使得它们的和与 target �?接近。返回这三个数的和�?�假定每组输入只存在唯一答案�?

例如，给定数�? nums = [-1�?2�?1�?-4], �? target = 1.

�? target �?接近的三个数的和�? 2. (-1 + 2 + 1 = 2).

 */
package leetcode.no001_099;

import java.util.Arrays;

public class No16_Solution_最接近的三数之和 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length; i++) {
			int L = i + 1;
			int R = nums.length - 1;
			while (L < R) {
				int temp = nums[i] + nums[L] + nums[R];
				if (Math.abs(target - temp) < Math.abs(target - sum)) {
					sum = temp;
				}
				if (temp > target) {
					R--;
				} else if (temp < target) {
					L++;
				} else if (temp == target) {
					return sum;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		No16_Solution_最接近的三数之和 n = new No16_Solution_最接近的三数之和();
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(n.threeSumClosest(nums, target));
	}
}
