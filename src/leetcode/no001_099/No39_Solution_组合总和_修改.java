/**
 * 给定�?个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合�??

candidates 中的数字可以无限制重复被选取�?

说明�?

�?有数字（包括 target）都是正整数�?
解集不能包含重复的组合�?��?
示例 1:

输入: candidates = [2,3,6,7], target = 7,
�?求解集为:
[
  [7],
  [2,2,3]
]
示例 2:

输入: candidates = [2,3,5], target = 8,
�?求解集为:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

来源：力扣（LeetCode�?
链接：https://leetcode-cn.com/problems/combination-sum
著作权归领扣网络�?有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */
package leetcode.no001_099;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class No39_Solution_组合总和_修改 {
	private List<List<Integer>> resList = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		if (candidates.length == 0) {
			return resList;
		}
		Arrays.sort(candidates);
		findCombination(candidates, target, 0, 0, new Stack<Integer>());
		return resList;
	}

	private void findCombination(int[] candidates, int target, int index, int sum, Stack<Integer> pre) {
		if (index >= candidates.length) {
			return;
		}
		if (sum > target) {
			return;
		}
		if (sum == target) {
			List<Integer> tempList = new ArrayList<Integer>(pre);
			resList.add(tempList);
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			pre.add(candidates[i]);
			sum = sum+candidates[i];
			findCombination(candidates, target, i, sum, pre);
			pre.pop();
		}
		return;
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		No39_Solution_组合总和_修改 n = new No39_Solution_组合总和_修改();
		List<List<Integer>> l = n.combinationSum(candidates, target);
		System.out.println(l);
	}

}
