/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
package offer;

import java.util.ArrayList;

public class Solution_左旋转字符串 {
	public static void main(String[] args) {
		Solution_左旋转字符串 s = new Solution_左旋转字符串();
		System.out.println(s.LeftRotateString("", 6));
	}

	public String LeftRotateString(String str, int n) {
		if (str == "" || str.length() < n) {
			return "";
		}
		char[] charArray = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);
		}
		for (int j = 0; j < n; j++) {
			list.add(list.get(j));
		}
		for (int j = 0; j < n; j++) {
			list.remove(0);
		}
		String s = "";
		for (Character c : list) {
			s += c;
		}
		return s;
	}
}
