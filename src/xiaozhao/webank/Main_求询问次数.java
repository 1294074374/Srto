package xiaozhao.webank;

import java.util.Scanner;

public class Main_求询问次数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		System.out.println(res);
	}

}