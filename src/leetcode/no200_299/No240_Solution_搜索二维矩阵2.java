package leetcode.no200_299;

public class No240_Solution_ËÑË÷¶şÎ¬¾ØÕó2 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == target) {
					return true;
				}
			}
		}
		return false;
	}
}
