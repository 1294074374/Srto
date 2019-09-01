package xiaozhao;

import java.util.Scanner;

public class Tencent_ÆÚÄ©×Ü½á_dp {
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
		int len = w.length;
		int[][] dp = new int[len][len];
		int[][] ant = new int[len][len];
		int[][] nowMin = new int[len][len];
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += w[j];
				ant[i][j] = sum;
			}
		}
		for (int i = 0; i < len; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < len; j++) {
				min = Math.min(min, w[j]);
				nowMin[i][j] = min;
			}
		}
		for (int i = 0; i < len; i++) {
			dp[0][i] = ant[0][i] * nowMin[0][i];
			dp[i][i] = w[i] * w[i];
		}
		int res = Integer.MIN_VALUE;
		for (int i = 1; i < len; i++) {
			for (int j = i; j < len; j++) {
				dp[i][j] = ant[i][j] * nowMin[i][j];
				if(res<dp[i][j]) {
					res=dp[i][j];
				}
			}
		}
		return res;
	}
}
