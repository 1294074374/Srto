/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。

示例:

输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

 */
package leetcode.no001_100;

import java.util.ArrayList;
import java.util.List;

public class No46_Solution_全排列 {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {
		Perm(nums, 0, nums.length);
		return resList;
	}

	private void Perm(int[] nums, int k, int len) {
		if (k == len) {
			List<Integer> sta = new ArrayList<Integer>();
			for (int i = 0; i < len; i++) {
				sta.add(nums[i]);
			}
			resList.add(sta);
		} else {
			for (int j = k; j < len; j++) {
				int temp = nums[j];
				nums[j] = nums[k];
				nums[k] = temp;

				Perm(nums, k + 1, len);

				temp = nums[j];
				nums[j] = nums[k];
				nums[k] = temp;
			}
		}

	}

	public static void main(String[] args) {
		No46_Solution_全排列 n = new No46_Solution_全排列();
		int[] nums = { 1, 2, 3 };
		System.out.println(n.permute(nums));
	}
}
