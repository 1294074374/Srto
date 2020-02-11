package leetcode.no101_200;

public class No136_只出现一次的数字 {
	public int singleNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
		return res;
	}
}
