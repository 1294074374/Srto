/**
 * 题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
package offer;

import java.util.HashMap;

public class Solution_数组中出现次数超过一半的数字 {
	public static void main(String[] args) {
		Solution_数组中出现次数超过一半的数字 s = new Solution_数组中出现次数超过一半的数字();
		int[] test = { 1, 2, 3, 2, 4, 2, 5, 2, 3 };
		System.out.println(s.MoreThanHalfNum_Solution(test));
	}

	public int MoreThanHalfNum_Solution(int[] array) {
		if (array.length == 1)
			return array[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) > array.length / 2) {
				return array[i];
			}
		}
		return 0;
	}
}
