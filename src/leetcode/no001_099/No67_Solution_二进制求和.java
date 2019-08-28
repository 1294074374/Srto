package leetcode.no001_099;

public class No67_Solution_二进制求和 {
	public String addBinary(String a, String b) {
		StringBuffer strBuffer = new StringBuffer();
		int len1 = a.length() - 1;
		int len2 = b.length() - 1;
		int temp1 = 0;
		int temp2 = 0;
		int carry = 0;
		int sum = 0;
		while (len1 >= 0 || len2 >= 0) {
			if (len1 < 0) {
				temp1 = 0;
			} else {
				temp1 = a.charAt(len1--) - '0';
			}
			if (len2 < 0) {
				temp2 = 0;
			} else {
				temp2 = b.charAt(len2--) - '0';
			}
			sum = carry + temp1 + temp2;
			strBuffer.append(sum % 2 + "");
			carry = sum / 2;
		}
		if (carry == 1) {
			strBuffer.append("1");
		}
		return strBuffer.reverse().toString();
	}

	public static void main(String[] args) {
		No67_Solution_二进制求和 n = new No67_Solution_二进制求和();
		String a = "1010";
		String b = "1011";
		System.out.println(n.addBinary(a, b));
	}
}
