/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

例如，给出 n = 3，生成结果为：

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class No22_Solution_括号生成 {
	// List<String> resList = new ArrayList<String>();
	Set<String> resSet = new HashSet<String>();

	public List<String> generateParenthesis(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			str += "()";
		}
		char[] c = str.toCharArray();
		Perm(c, 0, c.length);
		List<String> resList = new ArrayList<String>(resSet);
		return resList;
	}

	private void Perm(char[] c, int index, int len) {
		if (index == len) {
			String res = new String(c);
			if (check(res)) {
				// resList.add(res);
				resSet.add(res);
			}
		}
		for (int i = index; i < len; i++) {
			char temp = c[i];
			c[i] = c[index];
			c[index] = temp;

			Perm(c, i + 1, len);

			temp = c[i];
			c[i] = c[index];
			c[index] = temp;

		}

	}

	private boolean check(String res) {
		char[] c = res.toCharArray();
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ')' && sta.isEmpty()) {
				return false;
			}
			if (c[i] == '(') {
				sta.add(c[i]);
			} else {
				if (c[i] == ')' && sta.pop() != '(') {
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
		No22_Solution_括号生成 n = new No22_Solution_括号生成();
		System.out.println(n.generateParenthesis(4));
		System.out.println(n.resSet);
	}
}
