package leetcode.no500_599;

public class No507_完美数 {
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
		No507_完美数 n = new No507_完美数();
		System.out.println(n.checkPerfectNumber(28));
	}
}
