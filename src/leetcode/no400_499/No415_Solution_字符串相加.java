package leetcode.no400_499;

public class No415_Solution_字符串相加 {
	public String addStrings(String num1, String num2) {
		int len1 = num1.length() - 1;
		int len2 = num2.length() - 1;
		int temp1 = 0;
		int temp2 = 0;
		int count = 0;
		int sum = 0;
		StringBuffer strBuffer = new StringBuffer();
		while (len1 >= 0 || len2 >= 0) {
			if (len1 < 0) {
				temp1 = 0;
			} else {
				temp1 = num1.charAt(len1--) - '0';
			}
			if (len2 < 0) {
				temp2 = 0;
			} else {
				temp2 = num2.charAt(len2--) - '0';
			}
			sum = count + temp1 + temp2;
			strBuffer.append(sum % 10);
			// 进位
			count = sum / 10;
		}
		if (count == 1) {
			strBuffer.append("1");
		}
		return strBuffer.reverse().toString();
	}
}
