/**
 * 题目描述
括号配对问题
输入描述:
给定一个字符串S，请检查该字符串的括号是否配对，只含有"[", "]", "(", ")"
输出描述:
配对，返回true

不配对，返回false
示例1
输入
复制
abcd(])[efg
输出
复制
false
 */
package xiaozhao;

import java.util.Scanner;

public class Vipshop_括号配对问题2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		char[] c = s.toCharArray();
		System.out.println(check(c));
	}

	private static boolean check(char[] c) {
		int daL = 0;
		int daR = 0;
		int xiaoL = 0;
		int xiaoR = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] == ')' && daR == 1) {
				return false;
			}
			if (c[i] == ']' && xiaoR == 1) {
				return false;
			}
			if (c[i] == ')' && xiaoL == 1 && daL == 1) {
				return false;
			}
			if (c[i] == ']' && daL == 1 && xiaoL == 1) {
				return false;
			}
			if (c[i] == '(' && xiaoL == 0) {
				xiaoL = 1;
			}
			if (c[i] == '[' && daL == 0) {
				daL = 1;
			}
			if (c[i] == ')' && xiaoL == 1) {
				xiaoL = 0;
			}
			if (c[i] == ']' && daL == 1) {
				daL = 0;
			}

		}
		return true;
	}
}
