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
import java.util.List;

public class No417_Solution_太平洋大西洋水流问题_dfs {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();
	int[][] Atlantic;
	int[][] Pacific;

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		Atlantic = new int[m + 1][n + 1];
		Pacific = new int[m + 1][n + 1];
		for (int i = 1; i < m; i++) {
			dfsPacificUp(1, i);
		}

		dfsAtlantic(0, n - 1);
		// 初始�??
//		for (int i = 0; i < m; i++) {
//			dpAtlantic[i][n - 1] = 1;
//			dpPacific[i][0] = 1;
//		}
//		for (int j = 0; j < n; j++) {
//			dpAtlantic[m - 1][j] = 1;
//			dpPacific[0][j] = 1;
//		}
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(dpAtlantic[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(dpPacific[i][j] + " ");
//			}
//			System.out.println();
//		}

		return resList;
	}

	private void dfsAtlantic(int x, int y) {
		if (x <= 0 || x >= Atlantic.length || y <= 0 || y <= Atlantic[0].length) {
			return;
		}

	}

	private void dfsPacificUp(int x, int y) {
		if (x <= 0 || x >= Pacific.length || y <= 0 || y <= Pacific[0].length) {
			return;
		}
		
	}

	public static void main(String[] args) {
		No417_Solution_太平洋大西洋水流问题_dfs n = new No417_Solution_太平洋大西洋水流问题_dfs();
		int[][] matrix = { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 },
				{ 5, 1, 1, 2, 4 } };
		System.out.println(n.pacificAtlantic(matrix));
	}
}
