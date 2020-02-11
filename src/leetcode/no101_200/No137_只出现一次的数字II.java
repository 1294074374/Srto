package leetcode.no101_200;

import java.util.HashMap;
import java.util.Map;

public class No137_只出现一次的数字II {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		int result = 0;
		for (Integer i : map.keySet()) {
			if (map.get(i) == 1)
				result = i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}
