package xiaozhao.vip;

import java.util.*;

public class Main_二进制加法 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		System.out.print(add(a, b));
	}

	public static String add(String a, String b) {
		int num1 = Integer.parseInt(a, 2);
		int num2 = Integer.parseInt(b, 2);
		return Integer.toBinaryString(num1 + num2).toString();
	}
}