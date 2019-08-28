/**
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。

示例:

输入:
[1,2,3]

输出:
3

解释:
只需要3次移动（注意每次移动会增加两个元素的值）：

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
package interview;

import java.util.Arrays;

public class Solution_3 {
	public int minMoves(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = nums.length - 1; i > 0; i--) {
			res += nums[i] - nums[0];

		}
		return res;
	}

	public static void main(String[] args) {
		Solution_3 s = new Solution_3();
		int[] nums = { 1, 2, 3 };
		System.out.println(s.minMoves(nums));
	}
}
