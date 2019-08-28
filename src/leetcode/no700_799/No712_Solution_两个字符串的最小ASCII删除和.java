package leetcode.no700_799;

public class No712_Solution_�����ַ�������СASCIIɾ���� {
	public int minimumDeleteSum(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		// ��ʼ��
		for (int i = 1; i <= s1.length(); i++) {
			dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
		}
		for (int j = 1; j <= s2.length(); j++) {
			dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
		}

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				else
					dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
			}
		}
		return dp[s1.length()][s2.length()];
	}

	public static void main(String[] args) {
		No712_Solution_�����ַ�������СASCIIɾ���� n = new No712_Solution_�����ַ�������СASCIIɾ����();
		String s1 = "delete";
		String s2 = "leet";
		System.out.println(n.minimumDeleteSum(s1, s2));
	}
}
