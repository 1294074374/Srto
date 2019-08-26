package leetcode.no001_099;

public class No64_Solution_最小路径和 {
	public int minPathSum(int[][] grid) {
		int x = grid.length;
		int y = grid[0].length;
		int[][] dp = new int[x][y];
		dp[0][0] = grid[0][0];
		// 初始化行
		for (int i = 1; i < y; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}
		// 初始化列
		for (int i = 1; i < x; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		// 动态规划内部
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				dp[i][j] = Math.min(dp[i][j - 1] + grid[i][j], dp[i - 1][j] + grid[i][j]);
			}
		}
		
		return dp[x-1][y-1];
	}
	public static void main(String[] args) {
		No64_Solution_最小路径和 n  = new No64_Solution_最小路径和();
		int[][] grid = {
				{1,3,1},
				  {1,5,1},
				  {4,2,1}
		};
		System.out.println(n.minPathSum(grid));
	}
}
