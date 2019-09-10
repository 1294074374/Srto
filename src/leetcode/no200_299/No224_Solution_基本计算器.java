package leetcode.no200_299;

import java.util.Stack;

public class No224_Solution_»ù±¾¼ÆËãÆ÷ {
	public int calculate(String s) {
		Stack<Character> sta = new Stack<Character>();
		StringBuffer strBuffer = new StringBuffer();
		int res = 0;
		if (s.equals("")) {
			return 0;
		}
		boolean flag = false;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ')') {
				System.out.println(sta);
				System.out.println(strBuffer);
				System.out.println(flag);
			}
		}
		return res;
	}
}
