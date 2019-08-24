/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？



例如，上图是一个7 x 3 的网格。有多少可能的路径？

说明：m 和 n 的值均不超过 100。

示例 1:

输入: m = 3, n = 2
输出: 3
解释:
从左上角开始，总共有 3 条路径可以到达右下角。
1. 向右 -> 向右 -> 向下
2. 向右 -> 向下 -> 向右
3. 向下 -> 向右 -> 向右
示例 2:

输入: m = 7, n = 3
输出: 28
 */
package leetcode.no001_100;

public class No62_Solution_不同路径 {
	int sum = 0;

	public int uniquePaths(int m, int n) {
		dfs(0, 0, m, n);
		return sum;
	}

	private void dfs(int x, int y, int m, int n) {
		// 越界
		if (x < 0 || y < 0 || x > m || y > n) {
			return;
		}
		if (x == m - 1 || y == n - 1) {
			sum++;
			return;
		}
		// 向下
		dfs(x + 1, y, m, n);
		// 向左
		dfs(x, y + 1, m, n);
	}

	public static void main(String[] args) {
		No62_Solution_不同路径 n = new No62_Solution_不同路径();
		System.out.println(n.uniquePaths(7, 3));
	}
}