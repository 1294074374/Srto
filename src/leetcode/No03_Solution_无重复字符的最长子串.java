/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
package leetcode;

public class No03_Solution_无重复字符的最长子串 {
	public static void main(String[] args) {
		No03_Solution_无重复字符的最长子串 s = new No03_Solution_无重复字符的最长子串();
		System.out.println(s.lengthOfLongestSubstring("au"));
	}

	public int lengthOfLongestSubstring(String s) {
		if(s.equals("")) {
			return 0;
		}
		if(s.equals(" ")) {
			return 1;
		}
		if(s.length()==1) {
			return 1;
		}
		int[][] res = new int[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j+1);
				res[i][j] = check(sub);
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (res[i][j] > result) {
					result = res[i][j];
				}
			}
		}
		return result;
	}

	private int check(String sub) {
		if (sub.length() == 1) {
			return 1;
		}
		for (int i = 0; i < sub.length()-1; i++) {
			char temp = sub.charAt(i);
			for (int j = i+1; j < sub.length(); j++) {
				char t = sub.charAt(j);
				if (temp == t) {
					return 0;
				}
			}
		}
		return sub.length();
	}
}
