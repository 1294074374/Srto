package leetcode.no001_099;

public class No14_Solution_最长公共前缀 {
	String[] strs;

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		this.strs = strs;
		String res = "";
		int i = 0;
		while (check(i)) {
			res = res + strs[0].toCharArray()[i];
			i++;
		}
		return res;
	}

	private boolean check(int i) {
		for (int j = 0; j < strs.length; j++) {
			if (strs[j].equals("")) {
				return false;
			}
			if (strs[j].toCharArray().length <= i) {
				return false;
			}
			if (strs[0].toCharArray().length <= i) {
				return false;
			}
			char temp = strs[0].toCharArray()[i];
			if (temp != strs[j].toCharArray()[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		No14_Solution_最长公共前缀 n = new No14_Solution_最长公共前缀();
		String[] s = { "a" };
		System.out.println(n.longestCommonPrefix(s));
	}
}
