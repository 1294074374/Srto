package xiaozhao.gbit;

import java.util.Scanner;

public class Main_·ÅËûÈ¥ĞŞÏÉ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();

		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
			}
		}
		int[][] dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			dp[i][0] = map[i][0];
		}
		for (int i = 0; i < m; i++) {
			dp[0][i] = map[0][i];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				dp[i][j] = Math.min(dp[i - 1][j] + map[i][j], dp[i][j - 1] + map[i][j]);
			}
		}
		System.out.println(dp[n - 1][m - 1]);
		in.close();
	}
}
