package xiaozhao.netease;

import java.util.Scanner;

public class Main_二进制回文数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			String str = byto(arr[i]);
			System.out.println(check(str));
		}
		sc.close();
	}

	private static String check(String str) {
		StringBuffer strBuffer = new StringBuffer(str);
		String strReverse = strBuffer.reverse().toString();
		if(str.equals(strReverse)) {
			return "YES";
		}else {
			return "NO";
		}
	}

	private static String byto(int i) {
		StringBuffer strBuffer = new StringBuffer();
		while (i > 0) {
			int temp = i % 2;
			strBuffer.append(temp);
			i = i / 2;
		}
		return strBuffer.reverse().toString();
	}
}
