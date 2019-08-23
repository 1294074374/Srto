/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
package leetcode;

public class No53_Solution_最大子序和n {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int ans = nums[0];
		for (int num : nums) {
			if (sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {0,-1,2,3};
		No53_Solution_最大子序和n n = new No53_Solution_最大子序和n();
		System.out.println(n.maxSubArray(nums));
	}
}
