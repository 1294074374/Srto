package leetcode.no999_;

public class No1267_统计参与通信的服务器 {
	public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] row = new int[m]; // 统计某一行的服务器数量
        int[] col = new int[n]; // 统计某一列的服务器数量
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue;
                row[i] += 1; // 第 i 行服务器数量+1
                col[j] += 1; // 第 j 列服务器数量+1
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue; 
                // 该行该列的服务器数量只有一个（即其自身）则它无法与任何其他服务器通信
                if (row[i] == 1 && col[j] == 1) continue; 
                ans++;
            }
        }
        return ans;
    } 

}
