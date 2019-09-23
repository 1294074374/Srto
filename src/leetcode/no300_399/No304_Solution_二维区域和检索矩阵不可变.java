package leetcode.no300_399;

public class No304_Solution_二维区域和检索矩阵不可变 {
	int[][] matrix = { { 3, 0, 1, 4, 2 }, { 5, 6, 3, 2, 1 }, { 1, 2, 0, 1, 5 }, { 4, 1, 0, 1, 7 }, { 1, 0, 3, 0, 5 } };

	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		for (int i = row1; i <= row2; i++) {
			for (int j = col1; j <= col2; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		No304_Solution_二维区域和检索矩阵不可变 n = new No304_Solution_二维区域和检索矩阵不可变();
		System.out.println(n.sumRegion(2, 1, 4, 3));
	}
}
