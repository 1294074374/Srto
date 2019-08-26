/**
 * 给定�?个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合�?

给出数字到字母的映射如下（与电话按键相同）�?�注�? 1 不对应任何字母�??

示例:

输入�?"23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

来源：力扣（LeetCode�?
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
著作权归领扣网络�?有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */
package leetcode.no001_099;

import java.util.ArrayList;
import java.util.List;

public class No17_Solution_电话号码的字母组合 {

	private String letterMap[] = { "", " ", "abc", "def", "ghi", "jkl", "nmo", "pqrs", "tuv", "wxyz" };
	List<String> resList;

	public List<String> letterCombinations(String digits) {
		resList = new ArrayList<String>();
		if (digits.equals("")) {
			return resList;
		}

		findCombination(digits, 0, "");
		return resList;
	}

	private void findCombination(String digits, int i, String s) {
		if (i == digits.length()) {
			resList.add(s);
			return;
		}
		char c = digits.charAt(i);
		String letters = letterMap[c - '0'];
		for (int j = 0; j < letters.length(); j++) {
			findCombination(digits, i + 1, s + letters.charAt(j));
		}
		return;
	}

	public static void main(String[] args) {
		No17_Solution_电话号码的字母组合 n = new No17_Solution_电话号码的字母组合();
		List<String> resList = n.letterCombinations("23");
		for (String s : resList) {
			System.out.print(s + " ");
		}
	}
}
