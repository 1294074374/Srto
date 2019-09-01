package xiaozhao;

import java.util.Scanner;

public class Tencent_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] boxs = new int[n];
		int[] keys = new int[m];
		// ���뱦��
		for (int i = 0; i < n; i++) {
			boxs[i] = sc.nextInt();
		}
		// ����Կ��
		for (int i = 0; i < m; i++) {
			keys[i] = sc.nextInt();
		}
		System.out.println(treasure(boxs, keys));
		sc.close();
	}

	public static int treasure(int[] boxs, int[] keys) {
		// �������Ϊ�����ĸ���
		int boxsOddNumber = 0;
		// �������Ϊż���ĸ���
		int boxsEvenNumber = 0;
		// Կ�׺���Ϊ�����ĸ���
		int keysOddNumber = 0;
		// Կ�׺���Ϊż���ĸ���
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
		// ����-ż�� ż��-���� ����ȡ����֮�е���Сֵ���
		int result = Math.min(keysOddNumber, boxsEvenNumber) + Math.min(keysEvenNumber, boxsOddNumber);
		return result;
	}
}
