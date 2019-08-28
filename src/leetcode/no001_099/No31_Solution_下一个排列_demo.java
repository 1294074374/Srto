package leetcode.no001_099;

import java.util.Arrays;

public class No31_Solution_下一个排列_demo {
	public void nextPermutation(int[] nums) {
		int index1 = -1, index2 = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				index1 = i - 1;
				index2 = i;
				break;
			}
		}
		if (index1 == -1) {
			Arrays.sort(nums);
			return;
		}
		for (int i = index2; i < nums.length; i++) {
			if (nums[i] > nums[index1])
				index2 = i;
		}
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
		int start = index1 + 1, end = nums.length - 1;
		while (start < end) {
			int tem = nums[start];
			nums[start++] = nums[end];
			nums[end--] = tem;
		}
	}

	public static void main(String[] args) {
		No31_Solution_下一个排列_demo n = new No31_Solution_下一个排列_demo();
		int[] nums = { 1 };
		n.nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
