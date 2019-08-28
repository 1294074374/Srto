package leetcode.no300_399;

public class No339_Solution_����λ���� {
	public int[] countBits(int num) {
		int[] res = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			res[i] = find(i);
		}
		return res;
	}

	private int find(int i) {
		int cnt = 0;
		while (i > 0) {
			if (i % 2 == 1)
				cnt++;
			i = i / 2;
		}
		return cnt;
	}

	public static void main(String[] args) {
		No339_Solution_����λ���� n = new No339_Solution_����λ����();
		int[] res = n.countBits(8888);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
			if(i%20 == 0) {
				System.out.println();
			}
		}
	}
}
