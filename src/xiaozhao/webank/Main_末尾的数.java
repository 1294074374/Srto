package xiaozhao.webank;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_Ä©Î²µÄÊý {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		BigInteger num = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			num = num.multiply(new BigInteger(i + ""));
		}
		String str = num.toString();
		for (int i = num.toString().length() - 1; i > -1; i--) {
			if (str.charAt(i) != '0') {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
