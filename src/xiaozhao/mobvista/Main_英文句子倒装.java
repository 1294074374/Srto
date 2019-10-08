package xiaozhao.mobvista;

import java.util.Scanner;

public class Main_Ó¢ÎÄ¾ä×Óµ¹×° {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i > -1; i--) {
			System.out.print(strArray[i] + " ");
		}
		in.close();
	}
}
