/**
 * 给定�??个整数数�?? nums ，找到一个具有最大和的连续子数组（子数组�??少包含一个元素），返回其�??大和�??

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和�??大，为�?6�??

 */
package leetcode.no001_099;

public class No53_Solution_最大子序和_动态规划 {
	public int maxSubArray(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return 0;
		}if(len ==1) {
			return nums[0];
		}
		int maxHear = nums[0];
		int maxFin = nums[0];
		for (int i =1; i < len; i++) {
			maxHear = Math.max(nums[i], maxHear + nums[i]);
			maxFin = Math.max(maxFin, maxHear);
		}
		return maxFin;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		No53_Solution_最大子序和_动态规划 n = new No53_Solution_最大子序和_动态规划();
		System.out.println(n.maxSubArray(nums));
	}
}
