package leetcode.no200_299;

import java.util.HashMap;

public class No260_只出现一次的数字 {
	public int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
		}
		int n = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				n++;
			}
		}
		int[] result = new int[n];
		int k = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				result[k] = key;
				k++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 5, 5, 3, 4 };
		No260_只出现一次的数字 n = new No260_只出现一次的数字();
		int[] r = n.singleNumber(nums);
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}

}
