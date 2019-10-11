package xiaozhao.shein;

import java.util.Scanner;

public class Main_µ¹ÖÃ×Ö·û´® {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strArray = s.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i] + " ");
		}
		sc.close();
	}
}
