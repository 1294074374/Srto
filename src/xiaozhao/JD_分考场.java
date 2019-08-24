package xiaozhao;

import java.util.Scanner;

public class JD_分考场 {
	static int[][] guanxi;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] out = new int[2 * n + 1];
		int len = 2 * n + 1;
		guanxi = new int[len][len];
		for (int i = 0; i < m; i++) {
			int G = in.nextInt();	
			int B = in.nextInt();
			guanxi[G][B] = 1;
		}
		in.close();
		while (check(len)) {
			for (int i = 0; i < len; i++) {
				int temp = 0;
				for (int j = 0; j < len; j++) {
					if (guanxi[i][j] == 1) {
						clear(i, len);
						break;
					}
				}
				if (temp > 0) {
					// 第i个人出去
					out[i] = 1;
					clear(i, len);
				}
			}
		}
		int res = 0;
		for (int j = 0; j < len; j++) {
			if (out[j] == 1) {
				res++;
			}

		}
		System.out.println(res);
		for (int j = 0; j < len; j++) {
			if (out[j] == 1) {
				System.out.print(j+" ");
			}

		}
	}

	private static boolean check(int len) {
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (guanxi[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	private static void clear(int k, int len) {
		for (int i = 0; i < len; i++) {
			guanxi[k][i] = 0;
		}
		for (int j = 0; j < len; j++) {
			guanxi[j][k] = 0;
		}
	}
}
