package xiaozhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Xunfei_ÌáÈ¡Êı×Ö {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		findNumber(str);
	}
	
	static void findNumber(String str) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			String s = str.substring(i, i + 1);
			if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6")
					|| s.equals("7") || s.equals("8") || s.equals("9") || s.equals("0")) {
				list.add(Integer.valueOf(s));

			}
		}
		int[] arr = new int[list.size()];
		if (list.size() == 0) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = list.get(i);
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
