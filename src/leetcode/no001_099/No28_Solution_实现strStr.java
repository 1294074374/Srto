/**
 * 实现 strStr() 函数�?

给定�?个 haystack 字符串和�?�? needle 字符串，�? haystack 字符串中找出 needle 字符串出现的第一个位�? (�?0�?�?)。如果不存在，则返回  -1�?

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:

当 needle 是空字符串时，我们应当返回什么�?�呢？这是一个在面试中很好的问题�?

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符�?
 */
package leetcode.no001_099;

public class No28_Solution_实现strStr {
	public int strStr(String haystack, String needle) {
		if (needle.equals("")) {
			return 0;
		}
		int len1 = haystack.length();
		int len2 = needle.length();
		if (len1 < len2) {
			return -1;
		}
		if (len1 == len2 && !haystack.equals(needle)) {
			return -1;
		}
		if (len1 == len2 && haystack.equals(needle)) {
			return 0;
		}
		for (int i = 0; i < len1 - len2+1; i++) {
			if (haystack.substring(i, i + len2).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		No28_Solution_实现strStr n = new No28_Solution_实现strStr();
		String haystack ="mississippi";
		String needle="pi";
		System.out.println(n.strStr(haystack, needle));
	}
}
