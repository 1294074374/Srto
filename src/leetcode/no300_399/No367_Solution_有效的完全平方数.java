package leetcode.no300_399;

public class No367_Solution_有效的完全平方数 {
	public boolean isPerfectSquare(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i = i + 2;
		}
		return num == 0;
	}

	public static void main(String[] args) {
		No367_Solution_有效的完全平方数 n = new No367_Solution_有效的完全平方数();
		System.out.println(n.isPerfectSquare(2147483647));
	}
}
