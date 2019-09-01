package xiaozhao;

import java.util.Scanner;

public class Tencent_ÆÚÄ©×Ü½á {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		System.out.println(conclusion(n, w));
		sc.close();
	}

	public static int conclusion(int n, int[] w) {
		int res = Integer.MIN_VALUE;
		int len = w.length;
		int[][] cln = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (i == j) {
					cln[i][j] = w[i] * w[j];
					continue;
				}
				int min = Integer.MAX_VALUE;
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += w[k];
					if (min > w[k]) {
						min = w[k];
					}
				}
				cln[i][j] = min * sum;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (res < cln[i][j]) {
					res = cln[i][j];
				}
			}
		}
		return res;
	}
}
