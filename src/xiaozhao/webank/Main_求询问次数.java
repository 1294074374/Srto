package xiaozhao.webank;

import java.util.Scanner;

public class Main_��ѯ�ʴ��� {
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