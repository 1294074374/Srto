/**
 * 给定�?个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合�??

candidates 中的每个数字在每个组合中只能使用�?次�??

说明�?

�?有数字（包括目标数）都是正整数�??
解集不能包含重复的组合�?��?
示例 1:

输入: candidates = [10,1,2,7,6,1,5], target = 8,
�?求解集为:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
示例 2:

输入: candidates = [2,5,2,1,2], target = 5,
�?求解集为:
[
  [1,2,2],
  [5]
]

来源：力扣（LeetCode�?
链接：https://leetcode-cn.com/problems/combination-sum-ii
著作权归领扣网络�?有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */

package leetcode.no001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class No40_Solution_组合总和 {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();
	int[] flag;

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		if (candidates.length == 0) {
			return resList;
		}
		Arrays.sort(candidates);
		// 标识是否使用�?
		flag = new int[candidates.length];
		findCombinationSum(candidates, target, 0, 0, new Stack<Integer>());

		return resList;
	}

	/**
	 * 
	 * @param candidates 求和数组
	 * @param target     目标�?
	 * @param index      下标
	 * @param sum        当前的和
	 * @param stack      存储加数
	 */
	private void findCombinationSum(int[] candidates, int target, int index, int sum, Stack<Integer> stack) {
		if (index > candidates.length) {
			return;
		}
		if (sum > target) {
			return;
		}
		if (sum == target) {
			resList.add(new ArrayList<Integer>(stack));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			// 重复
			if (flag[i] == 1) {
				continue;
			}
			// 去除相邻相同元素
			if (i > index && candidates[i] == candidates[i - 1]) {
				continue;
			}
			sum = sum + candidates[i];
			stack.add(candidates[i]);
			flag[i] = 1;
			findCombinationSum(candidates, target, i + 1, sum, stack);
			// 回溯
			sum = sum - candidates[i];
			stack.pop();
			flag[i] = 0;
		}

	}

	public static void main(String[] args) {
		No40_Solution_组合总和 n = new No40_Solution_组合总和();
		int[] candidates = { 2, 5, 2, 1, 2 };
		int target = 5;
		System.out.println(n.combinationSum2(candidates, target));
	}
}
