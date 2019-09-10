package xiaozhao.xiecheng;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	/*
	 * 请完成下面这个函数，实现题目要求的功能 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 开始写代码
	 ******************************/
	static String resolve1(String expr) {
		StringBuffer strBuffer = new StringBuffer();
		String res = "";
		char[] c = expr.toCharArray();
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				sta.add(c[i]);
				continue;
			}
			if (c[i] == ')') {
				if (sta.isEmpty()) {
					return "";
				} else if (sta.pop() != '(') {
					return "";
				}
			}
			if (c[i] == ')' && sta.pop() == '(') {
				res = strBuffer.toString() + res;
			}
			strBuffer.append(c[i]);
		}
		return strBuffer.reverse().toString();

	}

	static String resolve2(String expr) {
		// 空值返回
		if (expr.length() == 0 || expr == null) {
			return "";
		}
		Stack<Character> staLeft = new Stack<>();
		Stack<Character> staRight = new Stack<>();
		for (int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) == '(') {
				staLeft.push('(');
			} else if (expr.charAt(i) == ')') {
				if (staLeft.isEmpty()) {
					return "";
				}
				staLeft.pop();
				StringBuffer tem = new StringBuffer();
				while (!staRight.isEmpty()) {
					tem.append(staRight.pop());
				}
				for (int j = 0; j < tem.length(); j++) {
					staRight.push(tem.charAt(j));
				}
			} else {
				staRight.push(expr.charAt(i));
			}
		}
		if (!staLeft.isEmpty()) {
			return "";
		}
		StringBuffer res = new StringBuffer();
		while (!staRight.isEmpty()) {
			res.append(staRight.pop());
		}

		return res.reverse().toString();
	}

	static String resolve3(String expr) {
		if (expr.contains("(") && !expr.contains(")"))
			return "";
		if (expr.contains(")") && !expr.contains("("))
			return "";
		while (expr.contains("(")) {
			int end = expr.indexOf(")");
			String subStr = expr.substring(0, end);
			int star = subStr.lastIndexOf("(");
			String temp = subStr.substring(star + 1, end);
			StringBuilder sb = new StringBuilder(temp);
			sb.reverse();
			expr = expr.substring(0, star) + sb.toString() + expr.substring(end + 1, expr.length());
		}
		return expr;

	}

	static String resolve(String expr) {
		char[] c = expr.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		if (expr.contains(")") && !expr.contains("("))
			return "";
		if (expr.contains("(") && !expr.contains(")"))
			return "";

		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				stack.push(i);
			} else if (c[i] == ')') {
				int left = stack.peek();
				int right = i;
				stack.pop();
				while (left < right) {
					while (left < right && (c[left] == '(' || c[left] == ')'))
						left++;
					while (left < right && (c[right] == '(' || c[right] == ')'))
						right--;
					char temp = c[left];
					c[left] = c[right];
					c[right] = temp;
					left++;
					right--;
				}
			}
		}
		String res = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == ')')
				continue;
			res = res + c[i];
		}
		return res;
	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res;

		String _expr;
		try {
			_expr = in.nextLine();
		} catch (Exception e) {
			_expr = null;
		}

		res = resolve(_expr);
		System.out.println(res);
		in.close();
	}
}
