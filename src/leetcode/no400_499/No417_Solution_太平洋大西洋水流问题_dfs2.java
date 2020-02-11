/***
 * 给定�??�?? m x n 的非负整数矩阵来表示�??片大陆上各个单元格的高度。�?�太平洋”处于大陆的左边界和上边界，而�?�大西洋”处于大陆的右边界和下边界�??

规定水流只能按照上�?�下、左、右四个方向流动，且只能从高到低或�?�在同等高度上流动�??

请找出那些水流既可以流动到�?�太平洋”，又能流动到�?�大西洋”的陆地单元的坐标�??

 

提示�??

输出坐标的顺序不重要
m �?? n 都小�??150
 

示例�??

 

给定下面�?? 5x5 矩阵:
fs
  太平�?? ~   ~   ~   ~   ~ 
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * 大西�??

返回:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单�??).

 */
package leetcode.no400_499;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No417_Solution_太平洋大西洋水流问题_dfs2 {
	int m, n, nextI, nextJ;
	int direct[][] = { { -1, 0, 1, 0 }, { 0, 1, 0, -1 } };
	Queue<int[]> queue = new LinkedList<>();

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		List<List<Integer>> result = new ArrayList<>();
		m = matrix.length;
		if (m == 0) {
			return result;
		}
		n = matrix[0].length;
		boolean[][] Pacific = new boolean[m][n];
		boolean[][] Atlantic = new boolean[m][n];
		for (int i = 0; i < n; i++) {
			// dfs(matrix, 0, i, Pacific);
			bfs(matrix, 0, i, Pacific);
			// dfs(matrix, m-1, i, Atlantic);
			bfs(matrix, m - 1, i, Atlantic);
		}
		for (int i = 0; i < m; i++) {
			// dfs(matrix, i, 0, Pacific);
			bfs(matrix, i, 0, Pacific);
			// dfs(matrix, i, n-1, Atlantic);
			bfs(matrix, i, n - 1, Atlantic);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (Pacific[i][j] == true && Atlantic[i][j] == true) {
					result.add(Arrays.asList(i, j));
				}
			}
		}
		return result;
	}

	public void dfs(int[][] matrix, int i, int j, boolean[][] visited) {
		if (visited[i][j] == true) {
			return;
		}
		visited[i][j] = true;
		for (int k = 0; k < 4; k++) {
			nextI = i + direct[0][k];
			nextJ = j + direct[1][k];
			if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && matrix[nextI][nextJ] >= matrix[i][j]) {
				dfs(matrix, nextI, nextJ, visited);
			}
		}
	}

	public void bfs(int[][] matrix, int i, int j, boolean[][] visited) {
		if (visited[i][j] == true) {
			return;
		}
		queue.offer(new int[] { i, j });
		int curI, curJ;
		int[] pos;
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			pos = queue.poll();
			curI = pos[0];
			curJ = pos[1];
			for (int k = 0; k < 4; k++) {
				nextI = curI + direct[0][k];
				nextJ = curJ + direct[1][k];
				if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ < n && matrix[nextI][nextJ] >= matrix[curI][curJ]
						&& visited[nextI][nextJ] == false) {
					queue.add(new int[] { nextI, nextJ });
					visited[nextI][nextJ] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		No417_Solution_太平洋大西洋水流问题_dfs2 n = new No417_Solution_太平洋大西洋水流问题_dfs2();
		int[][] matrix = { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 },
				{ 5, 1, 1, 2, 4 } };
		System.out.println(n.pacificAtlantic(matrix));
	}
}
