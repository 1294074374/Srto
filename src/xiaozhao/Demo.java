package xiaozhao;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().replace(" ", "").split(",");
		int[] a = new int[arr.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(a);
		int l = 0;
		int r = a.length - 1;
		int res = 0;
		while (l < r) {
			if (a[l] + a[r] > 0) {
				r--;
			} else if (a[l] + a[r] < 0) {
				l++;
			} else {
				res++;
				l++;
				r--;
			}
		}
		System.out.println(res);
		sc.close();
	}

}