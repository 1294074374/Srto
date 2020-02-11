package leetcode.no500_599;

public class No507_������ {
	public boolean checkPerfectNumber(int num) {
		if (num <= 1)
			return false;
		int result = 1;
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				result = result + i;
				if (i * i != num) {
					result += num / i;
				}
			}
		}
		if (result == num) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		No507_������ n = new No507_������();
		System.out.println(n.checkPerfectNumber(28));
	}
}
