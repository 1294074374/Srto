package xiaozhao;

import java.util.Scanner;

public class Vipshop_整数的倒数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		in.close();
		if(x==-0) {
			System.out.println("-0");
			System.exit(0);
		}
		boolean flag = false;
		if (x < 0) {
			flag = true;
			x = Math.abs(x);
		}
		long res = 0;
		while (x > 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		System.out.println(flag ? "-" + res : res);
	}
}
