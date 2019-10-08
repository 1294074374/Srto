package xiaozhao.shein;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_字符集合 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			char[] c = str.toCharArray();
			StringBuffer sb = new StringBuffer();
			Set<Character> set = new HashSet<Character>();
			for (int i = 0; i < c.length; i++) {
				if (set.add(c[i])) // 判断是否已存在该字符
					sb.append(c[i]);
			}
			System.out.println(sb.toString());
		}
		in.close();
	}
}
