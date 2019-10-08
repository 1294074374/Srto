package xiaozhao.mobvista;

import java.util.Scanner;

public class Main_第一个只出现一次的字符 {
	public static int FirstNotRepeatingChar(String str) {
		int[] words = new int[58];
		if (str != "" && str != null) {
			// return -1;

			for (int i = 0; i < str.length(); i++) {
				words[((int) str.charAt(i)) - 65] += 1;
			}
			for (int i = 0; i < words.length; i++) {
				if (words[((int) str.charAt(i)) - 65] == 1) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(FirstNotRepeatingChar(str));
		in.close();
	}
}
