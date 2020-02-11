package leetcode.no999_;

public class No1267_ͳ�Ʋ���ͨ�ŵķ����� {
	public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] row = new int[m]; // ͳ��ĳһ�еķ���������
        int[] col = new int[n]; // ͳ��ĳһ�еķ���������
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue;
                row[i] += 1; // �� i �з���������+1
                col[j] += 1; // �� j �з���������+1
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue; 
                // ���и��еķ���������ֻ��һ�����������������޷����κ�����������ͨ��
                if (row[i] == 1 && col[j] == 1) continue; 
                ans++;
            }
        }
        return ans;
    } 

}
