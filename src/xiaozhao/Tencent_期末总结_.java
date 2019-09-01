package xiaozhao;

import java.util.Scanner;

public class Tencent_ÆÚÄ©×Ü½á_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		long res = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				long min = min(i, j, arr);
				long sum = sum(i, j, arr);
				if (min * sum > res) {
					res = min * sum;

				}
			}
		}
		System.out.println(res);
		sc.close();
	}

	private static long sum(int i, int j, long[] arr) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += arr[k];
		}
		return sum;
	}

	private static long min(int i, int j, long[] arr) {
		long min = Integer.MAX_VALUE;
		for (int k = i; k <= j; k++) {
			if (arr[k] < min) {
				min = arr[k];
			}
		}
		return min;
	}
}