/**
 * 给定�?个只包括 '('�?')'�?'{'�?'}'�?'['�?']' 的字符串，判断字符串是否有效�?

有效字符串需满足�?

左括号必须用相同类型的右括号闭合�?
左括号必须以正确的顺序闭合�??
注意空字符串可被认为是有效字符串�?

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
 */
package leetcode.no001_099;

import java.util.Stack;

public class No20_Solution_有效的括号 {
	public boolean isValid(String s) {
		Stack<Character> sta = new Stack<Character>();
		char[] carr = s.toCharArray();
		for (int i = 0; i < carr.length; i++) {
			if ((carr[i] == '}' || carr[i] == ']' || carr[i] == ')') && sta.isEmpty()) {
				return false;
			}
			if (carr[i] == '{' || carr[i] == '(' || carr[i] == '[') {
				sta.push(carr[i]);
			} else {
				if (carr[i] == '}' && sta.pop() != '{') {
					return false;
				}
				if (carr[i] == ')' && sta.pop() != '(') {
					return false;
				}
				if (carr[i] == ']' && sta.pop() != '[') {
					return false;
				}
			}
		}
		if (!sta.isEmpty()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		No20_Solution_有效的括号 n = new No20_Solution_有效的括号();
		System.out.println(n.isValid("]"));
	}
}
