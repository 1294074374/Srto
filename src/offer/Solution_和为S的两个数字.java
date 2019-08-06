/**
 * 题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
输出描述:
对应每个测试案例，输出两个数，小的先输出。
 */
package offer;

import java.util.ArrayList;

public class Solution_和为S的两个数字 {
	public static void main(String[] args) {
		Solution_和为S的两个数字 s = new Solution_和为S的两个数字();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int sum = 21;
		ArrayList<Integer> resList = s.FindNumbersWithSum(array, sum);
		for (Integer i : resList) {
			System.out.print(i + " ");
		}
	}

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<ArrayList<Integer>> countList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < array.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(array[i]);
			for (int j = array.length - 1; j > i; j--) {
				if (array[i] + array[j] == sum) {
					list.add(array[j]);
					countList.add(list);
					break;
				}
			}
		}
		int add1 = 0;
		int add2 = 0;
		int mux = Integer.MAX_VALUE;
		for (ArrayList<Integer> list : countList) {
			int tempA = list.get(0);
			int tempB = list.get(1);
			if (tempA * tempB < mux) {
				add1 = tempA;
				add2 = tempB;
				mux = tempA * tempB;
			}
		}
		ArrayList<Integer> resList = new ArrayList<Integer>();
		if (add1 == 0 && add2 == 0) {
			return resList;
		}
		resList.add(add1);
		resList.add(add2);
		return resList;
	}
}
