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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No417_Solution_太平洋大西洋水流问题_dfs {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();
	Set<List<Integer>> resSet = new HashSet<List<Integer>>();
	Set<List<Integer>> pesSet = new HashSet<List<Integer>>();
	int[][] Atlantic;
	int[][] Pacific;

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		if (matrix.length == 0)
			return resList;
		int m = matrix.length;
		int n = matrix[0].length;
		Atlantic = new int[m][n];
		Pacific = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				dfsAtlantic(matrix, Atlantic, i, j, i, j);
			}
		}
		for (List<Integer> temp : resSet) {
			int i = temp.get(0);
			int j = temp.get(1);
			dfsPacificUp(matrix, Atlantic, i, j, i, j);
		}
		for (List<Integer> temp : pesSet) {
			resList.add(temp);
		}
		return resList;
	}

	private void dfsAtlantic(int[][] matrix, int[][] Atlantic, int x, int y, int i, int j) {
		if (Atlantic[x][y] == -1) {
			return;
		}
		if (x < 0 || y < 0 || x - 1 < 0 || y - 1 < 0) {
			// 到达太平洋
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			list.add(j);
			resSet.add(list);
			return;
		}
		if (matrix[x][y] >= matrix[x - 1][y] && Atlantic[x - 1][y] != -1) {
			Atlantic[x][y] = -1;
			dfsAtlantic(matrix, Atlantic, x - 1, y, i, j);
			Atlantic[x][y] = matrix[x][y];
		}
		if (matrix[x][y] >= matrix[x][y - 1] && Atlantic[x][y - 1] != -1) {
			Atlantic[x][y] = -1;
			dfsAtlantic(matrix, Atlantic, x, y - 1, i, j);
			Atlantic[x][y] = matrix[x][y];
		}
		if (y + 1 > matrix[0].length && matrix[x][y] >= matrix[x][y + 1] && Atlantic[x][y + 1] != -1) {
			Atlantic[x][y] = -1;
			dfsAtlantic(matrix, Atlantic, x, y + 1, i, j);
			Atlantic[x][y] = matrix[x][y];
		}
		if (x + 1 > matrix.length && matrix[x][y] >= matrix[x + 1][y] && Atlantic[x + 1][y] != -1) {
			Atlantic[x][y] = -1;
			dfsAtlantic(matrix, Atlantic, x + 1, y, i, j);
			Atlantic[x][y] = matrix[x][y];
		}

	}

	private void dfsPacificUp(int[][] matrix, int[][] Pacific, int x, int y, int i, int j) {
		if (Atlantic[x][y] == -1) {
			return;
		}
		int n = matrix.length;
		int m = matrix[0].length;
		if (x + 1 >= n || y + 1 >= m) {
			// 到达大西洋
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			list.add(j);
			pesSet.add(list);
			return;
		}
		if (matrix[x][y] >= matrix[x + 1][y]) {
			Pacific[x][y] = -1;
			dfsPacificUp(matrix, Pacific, x + 1, y, i, j);
			Pacific[x][y] = matrix[x][y];
		}
		if (matrix[x][y] >= matrix[x][y + 1]) {
			Pacific[x][y] = -1;
			dfsPacificUp(matrix, Pacific, x, y + 1, i, j);
			Pacific[x][y] = matrix[x][y];
		}
		if (y - 1 > 0 && matrix[x][y] >= matrix[x][y - 1]) {
			Pacific[x][y] = -1;
			dfsPacificUp(matrix, Pacific, x, y - 1, i, j);
			Pacific[x][y] = matrix[x][y];
		}
		if (x - 1 > 0 && matrix[x][y] >= matrix[x - 1][y]) {
			Pacific[x][y] = -1;
			dfsPacificUp(matrix, Pacific, x - 1, y, i, j);
			Pacific[x][y] = matrix[x][y];
		}

	}

	public static void main(String[] args) {
		No417_Solution_太平洋大西洋水流问题_dfs n = new No417_Solution_太平洋大西洋水流问题_dfs();
		int[][] matrix = { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 },
				{ 5, 1, 1, 2, 4 } };
		System.out.println(n.pacificAtlantic(matrix));
	}
}
