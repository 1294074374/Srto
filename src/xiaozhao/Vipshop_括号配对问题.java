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
import java.util.Stack;

public class Vipshop_括号配对问题 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		char[] c = s.toCharArray();
		System.out.println(check(c));
	}

	private static boolean check(char[] c) {
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '[') {
				sta.push(c[i]);
				continue;
			}
			if (c[i] == ')' && sta.isEmpty()) {
				return false;
			}
			if (c[i] == ']' && sta.isEmpty()) {
				return false;
			}
			if (c[i] == ')' && !sta.peek().equals('(')) {
				return false;
			}
			if (c[i] == ']' && !sta.peek().equals('[')) {
				return false;
			}
			if (c[i] == ')' && sta.peek().equals('(')) {
				sta.pop();
				continue;
			}
			if (c[i] == ']' && sta.peek().equals('[')) {
				sta.pop();
				continue;
			}
			
		}
		return true;
	}
}
