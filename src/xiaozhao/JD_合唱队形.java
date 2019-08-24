package xiaozhao;

import java.util.Scanner;

public class JD_ºÏ³ª¶ÓÐÎ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] H = new int[N];
		for(int i = 0;i<N;i++) {
			H[i] = in.nextInt();
		}
		in.close();
		System.out.println(findNumber(H));
	}

	public static int findNumber(int[] a) {
		int start = 0;
		int res = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (start != 0) {
				i += start;
				start = 0;
			}
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] >= a[i]) {
					res++;
					break;
				}
				start++;
			}
		}
		if (a[a.length - 1] >= a[a.length - 2]) {
			res++;
		}
		return res;
	}
}