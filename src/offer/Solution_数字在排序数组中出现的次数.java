/**
 * 统计一个数字在排序数组中出现的次数。
 */
package offer;

import java.util.HashMap;

public class Solution_数字在排序数组中出现的次数 {
	public int GetNumberOfK(int[] array, int k) {
		// 合法性判断
		if (array.length == 0) {
			return 0;
		}
		
		// 使用hashmap的特性
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		if (map.get(k) == null) {
			return 0;
		} else {
			return map.get(k);
		}
	}

	public static void main(String[] args) {
		Solution_数字在排序数组中出现的次数 s = new Solution_数字在排序数组中出现的次数();
		int[] test = {3};
		System.out.println(s.GetNumberOfK(test, 3));
	}
}
