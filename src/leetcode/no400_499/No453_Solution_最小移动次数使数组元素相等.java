package leetcode.no400_499;

import java.util.Arrays;

public class No453_Solution_��С�ƶ�����ʹ����Ԫ����� {
	public int minMoves(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = nums.length - 1; i > 0; i--) {
			res += nums[i] - nums[0];

		}
		return res;
	}

	public static void main(String[] args) {
		No453_Solution_��С�ƶ�����ʹ����Ԫ����� s = new No453_Solution_��С�ƶ�����ʹ����Ԫ�����();
		int[] nums = { 1, 2, 3 };
		System.out.println(s.minMoves(nums));
	}
}
