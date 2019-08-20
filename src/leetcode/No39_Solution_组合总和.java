/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的数字可以无限制重复被选取。

说明：

所有数字（包括 target）都是正整数。
解集不能包含重复的组合。 
示例 1:

输入: candidates = [2,3,6,7], target = 7,
所求解集为:
[
  [7],
  [2,2,3]
]
示例 2:

输入: candidates = [2,3,5], target = 8,
所求解集为:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combination-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No39_Solution_组合总和 {
	private List<Integer> list = new ArrayList<Integer>();
	private List<List<Integer>> resList = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		if (candidates.length == 0) {
			return resList;
		}
		Arrays.sort(candidates);
		findCombination(candidates, target, 0, 0);
		return resList;
	}

	private void findCombination(int[] candidates, int target, int index, int sum) {
		if (index >= candidates.length) {
			return;
		}
		if (sum > target) {
			return;
		}
		if (sum == target) {
			List<Integer> tempList = new ArrayList<Integer>(list);
			resList.add(tempList);
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			list.add(candidates[i]);
			sum = sum + candidates[i];
			findCombination(candidates, target, i, sum);

			sum = sum - candidates[i];
			list.remove(list.size() - 1);
		}
		return;
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		No39_Solution_组合总和 n = new No39_Solution_组合总和();
		List<List<Integer>> l = n.combinationSum(candidates, target);
		for (List<Integer> l1 : l) {
			for (Integer i : l1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
