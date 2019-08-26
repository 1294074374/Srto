/**
 * 给定�?个字符串 s，找�? s 中最长的回文子串。你可以假设 s 的最大长度为 1000�?

示例 1�?

输入: "babad"
输出: "bab"
注意: "aba" 也是�?个有效答案�??
示例 2�?

输入: "cbbd"
输出: "bb"

 */
package leetcode.no001_099;

import java.util.ArrayList;

public class No05_Solution_最长回文子串_动态规划 {
	public static void main(String[] args) {
		No05_Solution_最长回文子串_动态规划 s = new No05_Solution_最长回文子串_动态规划();
		System.out.println(s.longestPalindrome("babad"));
	}
	public String longestPalindrome(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);
				if (check(str)) {
					list.add(str);
				}
			}
		}
		int resLength =Integer.MIN_VALUE;
		String resoult = "";
		for (String res : list) {
			if(resLength<res.length()) {
				resLength = res.length();
				resoult = res;
			}
		}
		return resoult;
	}

	private boolean check(String str) {
		if (str.length() == 1) {
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
