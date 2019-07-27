package offer;

import java.util.HashMap;

public class Solution_数组中只出现一次的数字 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		int[] test = new int[2];
		int i = 0;
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				test[i] = key;
				i++;
			}
		}
		num1[0] = test[0];
		num2[0] = test[1];
	}

	public static void main(String[] args) {
		Solution_数组中只出现一次的数字 s = new Solution_数组中只出现一次的数字();
		int[] array = { 2, 4, 3, 6, 3, 2, 5, 5 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		s.FindNumsAppearOnce(array, num1, num2);
	}
}
