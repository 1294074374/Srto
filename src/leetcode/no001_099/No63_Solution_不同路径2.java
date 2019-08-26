package leetcode.no001_099;

public class No63_Solution_不同路径2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		// 行数
		int m = obstacleGrid.length;
		// 列数
		int n = obstacleGrid[0].length;
		// 起点或�?�终点被堵死
		if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
			return 0;
		}
		int[][] dp = new int[m][n];
		// 初始�?
		boolean flagM = false;
		for (int i = 0; i < m; i++) {
			// 路径是否可达
			if (flagM) {
				dp[i][0] = 0;
			} else if (obstacleGrid[i][0] == 1) {
				flagM = true;
				dp[i][0] = 0;
			} else {
				dp[i][0] = 1;
			}
		}
		boolean flagN = false;
		for (int i = 0; i < n; i++) {
			// 路径是否可达
			if (flagN) {
				// 路径不可�?
				dp[0][i] = 0;
			} else if (obstacleGrid[0][i] == 1) {
				flagN = true;
				dp[0][i] = 0;
			} else {
				dp[0][i] = 1;
			}
		}

		// dp内部
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				// 上下封死 不可�?
				if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1) {
					dp[i][j] = 0;
				} else if (obstacleGrid[i][j - 1] == 1) {
					dp[i][j] = dp[i - 1][j];
				} else if (obstacleGrid[i - 1][j] == 1) {
					dp[i][j] = dp[i][j - 1];
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
//        for (int i = 0; i < m; i++) {
//            for (int k = 0; k < n; k++) {
//                System.out.print(dp[i][k]+"   ");
//            }
//            System.out.println();
//        }
		return dp[m - 1][n - 1];
	}

	public static void main(String[] args) {
		No63_Solution_不同路径2 n = new No63_Solution_不同路径2();
		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 }, };
		System.out.println(n.uniquePathsWithObstacles(obstacleGrid));

	}
}
