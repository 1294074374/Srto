package xiaozhao.netease;

import java.util.Scanner;

public class Main_ำกีย {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < t; i++) {
			String nm = sc.nextLine();
			int n = Integer.valueOf(nm.charAt(0) - '0');
			int m = Integer.valueOf(nm.charAt(2) - '0');
			int[][] map = new int[n][m];
			for (int j = 0; j < n; j++) {
				String temp = sc.nextLine();
				for (int k = 0; k < m; k++) {
					map[j][k] = Integer.valueOf(temp.charAt(k) - '0');
					
				}
			}
			System.out.println("-1 -1 -1 -1");
		}
		sc.close();
	}
}
