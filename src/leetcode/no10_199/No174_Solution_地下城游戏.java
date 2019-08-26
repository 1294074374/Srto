package leetcode.no10_199;

public class No174_Solution_地下城游戏 {
	public int calculateMinimumHP(int[][] dungeon) {
		int x = dungeon.length;
		int y = dungeon[0].length;
		int[][] dp = new int[x][y];
		
		return dp[0][0];
	}
}
