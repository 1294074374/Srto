package xiaozhao;

import java.util.Scanner;

public class Tencent_∞·‘Àπ§ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println(handle(n, m, a, sum));
		sc.close();
	}

	public static int handle(int n, int m, int[] a, int sum) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			
		}
		return result;
	}
}
