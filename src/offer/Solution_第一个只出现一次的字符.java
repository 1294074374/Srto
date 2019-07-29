/**
 * 题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
package offer;

public class Solution_第一个只出现一次的字符 {
	public int FirstNotRepeatingChar(String str) {
		int[] words = new int[58];
		if (str != "" && str != null) {
			//return -1;

			for (int i = 0; i < str.length(); i++) {
				words[((int) str.charAt(i)) - 65] += 1;
			}
			for (int i = 0; i < words.length; i++) {
				if (words[((int) str.charAt(i)) - 65] == 1) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution_第一个只出现一次的字符 s = new Solution_第一个只出现一次的字符();
		System.out.println(s.FirstNotRepeatingChar("sgeubislgnglksghalgngiengpp"));
	}
}
