package xiaozhao.shein;

import java.util.Scanner;

public class Main_字符集合2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			// 标记是否存在该字符
			int[] flag = new int[52];
			String str = in.nextLine();
			StringBuffer strBuffer = new StringBuffer();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' && flag[str.charAt(i) - 'a'] == 0) {
					strBuffer.append(str.charAt(i) + "");
					flag[str.charAt(i) - 'a'] = 1;
				} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					strBuffer.append(str.charAt(i) + "");
					flag[str.charAt(i) - 'A' + 26] = 1;
				}
			}
			System.out.println(strBuffer.toString());
		}
		in.close();
	}
}
