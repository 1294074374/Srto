/**
 * ����n(n��2)���������ҳ���С����ĵ�k������
 */
package dayoftest.test7_29;

import java.util.Scanner;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(-1>>2);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		// ����
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[k - 1]);
	}
}
