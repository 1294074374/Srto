/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， 
{2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
{2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
package offer;

import java.util.ArrayList;

public class Solution_滑动窗口的最大值 {
	public static void main(String[] args) {
		Solution_滑动窗口的最大值 s = new Solution_滑动窗口的最大值();
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		int size = 3;
		ArrayList<Integer> list = s.maxInWindows(num, size);
		System.out.println(list);
	}

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (size <= 0 || num.length == 0) {
			return list;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length - size + 1; i++) {
			int j = i + size - 1;
			for (int k = i; k <= j; k++) {
				if (num[k] > max) {
					max = num[k];
				}
			}
			list.add(max);
			max = Integer.MIN_VALUE;
		}
		return list;
	}
}
