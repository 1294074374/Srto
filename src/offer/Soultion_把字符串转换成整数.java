/**
 * 题目描述
将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
  数值为0或者字符串不是一个合法的数值则返回0。
输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述:
如果是合法的数值表达则返回该数字，否则返回0
示例1
输入
复制
+2147483647
    1a33
输出
复制
2147483647
    0


 */
package offer;

public class Soultion_把字符串转换成整数 {
	public static void main(String[] args) {
		Soultion_把字符串转换成整数 s = new Soultion_把字符串转换成整数();
		System.out.println(s.StrToInt("+123"));
	}

	public int StrToInt(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int sum = 0;
		char[] charArray = str.toCharArray();
		int symbol = 0;
		if (charArray[0] == '-') {
			symbol = 1;
		}
		for (int i = symbol; i < str.length(); i++) {
			if (charArray[i] == '+') {
				continue;
			}
			if (charArray[i] <= '0' || charArray[i] >= '9') {
				return 0;
			}
			sum = sum * 10 + charArray[i] - 48;
		}
		return symbol == 0 ? sum : sum * -1;
	}
}
