/**
 * 给定�?个字符串，请你找出其中不含有重复字符的 最长子串 的长度�?

示例 1:

输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的�?长子串是 "abc"，所以其长度�? 3�?
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的�?长子串是 "b"，所以其长度�? 1�?
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的�?长子串是 "wke"，所以其长度�? 3�?
     请注意，你的答案必须�? 子串 的长度，"pwke" 是一个子序列，不是子串�??
 */
package leetcode.no001_099;

import java.util.HashMap;

public class No03_Solution_无重复字符的最长子串_移动窗口{
	public static void main(String[] args) {
		No03_Solution_无重复字符的最长子串_移动窗口 s = new No03_Solution_无重复字符的最长子串_移动窗口();
		System.out.println(s.lengthOfLongestSubstring("pwwkew"));
	}

	public int lengthOfLongestSubstring(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int left=0;
		int max = 0;
		for(int i =0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				left = Math.max(left, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max,i-left+1);
		}
		return max;
	}
}
