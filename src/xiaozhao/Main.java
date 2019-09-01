package xiaozhao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] dp = new long[100000];
		for (int i = 0; i < k; i++)
			dp[i] = 1;
		for (int i = k; i < 100000; i++)
			dp[i] = dp[i - k] + dp[i - 1];
		for (int i = 2; i < 100000; i++)
			dp[i] = dp[i] + dp[i - 1];
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(dp[b] - dp[a - 1]);
		}

	}

}