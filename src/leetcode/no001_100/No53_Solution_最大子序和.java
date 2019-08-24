/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
package leetcode.no001_100;

public class No53_Solution_最大子序和 {
	public int maxSubArray(int[] nums) {
		int result = Integer.MIN_VALUE;
		int len = nums.length;
		int[][] arr = new int[len][len];
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += nums[j];
				arr[i][j] = sum;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i > j) {
					continue;
				} else {
					if (result < arr[i][j]) {
						result = arr[i][j];
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {};
		No53_Solution_最大子序和 n = new No53_Solution_最大子序和();
		System.out.println(n.maxSubArray(nums));
	}
}
