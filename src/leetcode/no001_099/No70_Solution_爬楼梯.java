/*
 * 假设你正在爬楼梯。需�? n 阶你才能到达楼顶�?

每次你可以爬 1 �? 2 个台阶�?�你有多少种不同的方法可以爬到楼顶呢�?

注意：给�? n 是一个正整数�?

示例 1�?

输入�? 2
输出�? 2
解释�? 有两种方法可以爬到楼顶�??
1.  1 �? + 1 �?
2.  2 �?
示例 2�?

输入�? 3
输出�? 3
解释�? 有三种方法可以爬到楼顶�??
1.  1 �? + 1 �? + 1 �?
2.  1 �? + 2 �?
3.  2 �? + 1 �?

 */
package leetcode.no001_099;

public class No70_Solution_爬楼梯 {
	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);
	}

	public int climbStairsArray(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	public static void main(String[] args) {
		No70_Solution_爬楼梯 n = new No70_Solution_爬楼梯();
		System.out.println(n.climbStairsArray(44));
	}
}
