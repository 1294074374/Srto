package xiaozhao;

import java.util.Scanner;

public class Tencent_宝藏 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] boxs = new int[n];
		int[] keys = new int[m];
		// 输入宝箱
		for (int i = 0; i < n; i++) {
			boxs[i] = sc.nextInt();
		}
		// 输入钥匙
		for (int i = 0; i < m; i++) {
			keys[i] = sc.nextInt();
		}
		System.out.println(treasure(boxs, keys));
		sc.close();
	}

	public static int treasure(int[] boxs, int[] keys) {
		// 宝箱号码为奇数的个数
		int boxsOddNumber = 0;
		// 宝箱号码为偶数的个数
		int boxsEvenNumber = 0;
		// 钥匙号码为奇数的个数
		int keysOddNumber = 0;
		// 钥匙号码为偶数的个数
		int keysEvenNumber = 0;
		for (int i = 0; i < boxs.length; i++) {
			if (boxs[i] % 2 == 0)
				boxsEvenNumber++;
			else
				boxsOddNumber++;
		}
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] % 2 == 0)
				keysEvenNumber++;
			else
				keysOddNumber++;
		}
		// 奇数-偶数 偶数-奇数 所以取两者之中的最小值相加
		int result = Math.min(keysOddNumber, boxsEvenNumber) + Math.min(keysEvenNumber, boxsOddNumber);
		return result;
	}
}
