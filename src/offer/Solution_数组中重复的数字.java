/**
 * 题目描述
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
package offer;

import java.util.HashMap;

public class Solution_数组中重复的数字 {

	public static void main(String[] args) {
		Solution_数组中重复的数字 s = new Solution_数组中重复的数字();
		int[] numbers = {};
		int length = numbers.length;
		int[] duplication = new int[1];
		System.out.println(s.duplicate(numbers, length, duplication));
		System.out.println(duplication[0]);
	}

	/*
	 * Parameters: numbers: an array of integers length: the length of array numbers
	 * duplication: (Output) the duplicated number in the array number,length of
	 * duplication array is 1,so using duplication[0] = ? in implementation; Here
	 * duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
	 * 这里要特别注意~返回任意重复的一个，赋值duplication[0] Return value: true if the input is valid,
	 * and there are some duplications in the array number otherwise false
	 */
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (numbers == null || numbers.length == 0) {
			duplication[0] = -1;
			return false;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) == null) {
				map.put(numbers[i], 1);
			} else {
				map.put(numbers[i], map.get(numbers[i]) + 1);
			}
		}
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) >= 2) {
				duplication[j] = numbers[i];
				return true;
			}
		}

		return false;

	}
}
