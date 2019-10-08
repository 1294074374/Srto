package leetcode.no400_499;

public class No400_Solution_第N个数 {
	public int findNthDigit(int n) {
		int k = 1;
		n--;
		while (n > 0) {
			n = n - getlength(k);
			k++;

		}

		if (n == 0) {
			return k / (int) Math.pow(10, getlength(k) - 1);
		} else {
			int rtn = 0;
			k = k - 1;
			for (int i = n; i < 0; i++) {
				rtn = k % 10;
				k /= 10;
			}
			return rtn;
		}
	}

	private int getlength(int i) {
		int length = 0;
		while (i != 0) {
			length++;
			i /= 10;
		}
		return length;
	}

	/**
	 * 递推计算
	 * 
	 * @param n
	 * @return
	 */
	public int findNthDigit1(int n) {
		int maxi = 0;
		int i = 1;
		while (n > maxi + i * (Math.pow(10, i) - Math.pow(10, i - 1))) {
			maxi += i * (Math.pow(10, i) - Math.pow(10, i - 1));
			i++;
		}
		n -= maxi;
		n--;
		int remain = n % i;
		int counter = n / i;
		int inwhich = (int) Math.pow(10, i - 1) + counter;

		int rtn = 0;

		for (int j = 0; j < i - remain; j++) {
			rtn = inwhich % 10;
			inwhich /= 10;
		}
		return rtn;
	}

	public static void main(String[] args) {
		No400_Solution_第N个数 n = new No400_Solution_第N个数();
		System.out.println(n.findNthDigit(10000));
	}
}
