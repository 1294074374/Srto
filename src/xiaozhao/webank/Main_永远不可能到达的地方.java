package xiaozhao.webank;

import java.util.Scanner;

public class Main_永远不可能到达的地方 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] map = new int[n + 1][n + 1];
		int[] flag = new int[n + 1];
		for (int i = 1; i < m + 1; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			map[x][y] = 1;
			map[y][x] = 1;
		}
		int s = in.nextInt();
		int t = in.nextInt();
		flag[s] = 1;
		find(map, flag, s, t);
		for (int i = 1; i < n+1; i++) {
			if (flag[i] == 0) {
				System.out.print(i + " ");
			}
		}
		in.close();
	}

	private static void find(int[][] map, int[] flag, int s, int t) {
		if (s == t) {
			return;
		}
		for (int i = 1; i < map.length; i++) {
			if (map[s][i] == 1 && flag[i] == 0) {
				flag[i] = 1;
				find(map, flag, i, t - 1);

			}
		}
	}
}
