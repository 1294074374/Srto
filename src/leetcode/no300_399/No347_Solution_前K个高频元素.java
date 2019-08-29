package leetcode.no300_399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No347_Solution_前K个高频元素 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> resList = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}

		return resList;
	}

	public static void main(String[] args) {
		No347_Solution_前K个高频元素 n = new No347_Solution_前K个高频元素();
		int[] nums = { 1 };
		int k = 1;
		System.out.println(n.topKFrequent(nums, k));
	}
}
