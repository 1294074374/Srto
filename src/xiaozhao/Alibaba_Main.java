package xiaozhao;

import java.util.Scanner;

public class Alibaba_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int[][] area = new int[n][n];

		for (int i = 0; i < n; i++) {
			line = scanner.nextLine();
			String[] split = line.split(",");
			if (split.length != n) {
				throw new IllegalArgumentException("��������");
			}
			int j = 0;
			for (String num : split) {
				area[i][j++] = Integer.parseInt(num);
			}
		}
		 scanner.close();
		int minimumTimeCost = getMinimumTimeCost(n, area);
		
		System.out.println(minimumTimeCost);
	}

	/** ������������������ʵ����ĿҪ��Ĺ��� **/
	/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^ **/
	private static int getMinimumTimeCost(int n, int[][] area) {
		int res = 0;
		for (int i = 0; i < area[0].length; i++) {
			int j = 0;
			int temp = 0;
			while (j < area.length) {
				temp = area[j][i] + temp;
				j = j + 2;
			}
			res = Math.max(res, temp);
		}
		return res;
	}
}