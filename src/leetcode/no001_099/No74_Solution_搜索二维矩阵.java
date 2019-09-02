package leetcode.no001_099;

public class No74_Solution_ËÑË÷¶şÎ¬¾ØÕó {
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

	public static void main(String[] args) {

	}
}
