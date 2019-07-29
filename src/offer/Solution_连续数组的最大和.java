/**
 * 题目描述
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
package offer;

public class Solution_连续数组的最大和 {
	public static int[][] ARRAY;

	public int FindGreatestSumOfSubArray_demo(int[] array) {
		int[][] arr = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				arr[i][j] = sum;
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				if (result <= arr[i][j]) {
					result = arr[i][j];
				}
			}
		}
		return result;
	}

	public int FindGreatestSumOfSubArray(int[] array) {
		ARRAY = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				add(i, j, array);
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				if (result <= ARRAY[i][j]) {
					result = ARRAY[i][j];
				}
			}
		}
		return result;
	}

	private void add(int i, int j, int[] arr) {
		int res = 0;
		for (int k = i; k <= j; k++) {
			res += arr[k];
		}
		ARRAY[i][j] = res;
	}

	public static void main(String[] args) {
		Solution_连续数组的最大和 s = new Solution_连续数组的最大和();
		int[] test = { 6, -3, -2, 7, -15, 1, 2, 2, 2, -4, 2, -8, 11, 32, 95, 62, -93, 12 };
		System.out.println(s.FindGreatestSumOfSubArray_demo(test));
	}
}
