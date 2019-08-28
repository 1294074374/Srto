package leetcode.no001_099;

import java.util.Arrays;

public class No31_Solution_下一个排列 {
	public void nextPermutation(int[] nums) {
		if (nums.length == 1) {
			return;
		}
		// 最大字典序列
		if (check(nums)) {
			Arrays.sort(nums);
			return;
		}
		// 寻找最大值下标
		int maxIndex = -1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				maxIndex = i;
			} else {
				maxIndex = i + 1;
			}
		}
		if (maxIndex == 0) {
			for (int i = 1; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					maxIndex = i;
				} else {
					maxIndex = i + 1;
				}
			}
		}
		// 交换
		int temp = nums[maxIndex];
		nums[maxIndex] = nums[maxIndex - 1];
		nums[maxIndex - 1] = temp;
		
	}

	private boolean check(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		No31_Solution_下一个排列 n = new No31_Solution_下一个排列();
		int[] nums = {1};
		n.nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
