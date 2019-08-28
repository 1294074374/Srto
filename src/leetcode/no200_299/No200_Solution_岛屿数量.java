package leetcode.no200_299;

public class No200_Solution_µ∫”Ï ˝¡ø {
	char[][] grid;
	int nr;
	int nc;

	public int numIslands(char[][] grid) {
		this.grid = grid;
		int res = 0;

		if (grid == null || grid.length == 0) {
			return res;
		}
		nr = grid.length;
		nc = grid[0].length;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					res++;
					dfs(i, j);
				}
			}
		}
		return res;
	}

	private void dfs(int x, int y) {
		if (x < 0 || y < 0 || x >= nr || y >= nc || grid[x][y] == '0') {
			return;
		}
		grid[x][y] = '0';

		dfs(x - 1, y);
		dfs(x + 1, y);
		dfs(x, y - 1);
		dfs(x, y + 1);
	}
}
