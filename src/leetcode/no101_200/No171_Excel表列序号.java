package leetcode.no101_200;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * 
 * 例如，
 * 
 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ... 示例 1:
 * 
 * 输入: "A" 输出: 1 示例 2:
 * 
 * 输入: "AB" 输出: 28 示例 3:
 * 
 * 输入: "ZY" 输出: 701
 * 
 * @author laijunlin
 *
 */
public class No171_Excel表列序号 {
	public int titleToNumber(String s) {
		int result = 0;
		char[] str = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			int temp = (int) str[i] - 64;
			result += Math.pow(temp,i);
		}
		return result;
	}

	public static void main(String[] args) {
		No171_Excel表列序号 n = new No171_Excel表列序号();
		System.out.println(n.titleToNumber("AZ"));
	}
}
