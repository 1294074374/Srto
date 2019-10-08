package leetcode.no800_899;

import java.util.Stack;

public class No820_Solution_µ¥´ÊµÄÑ¹Ëõ±àÂë {
	public int minimumLengthEncoding(String[] words) {
		StringBuffer result = new StringBuffer();
		int maxLen = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLen) {
				maxLen = words[i].length();
			}
		}
		@SuppressWarnings("unchecked")
		Stack<String>[] staArray = new Stack[10];
		for (int i = 0; i < staArray.length; i++) {
			staArray[i] = new Stack<String>();
		}
		for (int i = 0; i < words.length; i++) {
			int l = words[i].length();
			staArray[l].push(words[i]);
		}
		for (int i = staArray.length - 1; i >= 0; i--) {
			while (!staArray[i].isEmpty()) {
				String tempString = staArray[i].pop();
				if (result.indexOf(tempString) == -1) {
					result.append(tempString + "#");
				}

			}
		} 
		return result.toString().length();

	}

	public static void main(String[] args) {
		No820_Solution_µ¥´ÊµÄÑ¹Ëõ±àÂë n = new No820_Solution_µ¥´ÊµÄÑ¹Ëõ±àÂë();
		String[] words = { "time", "me", "bell" };
		System.out.println(n.minimumLengthEncoding(words));
	}
}
