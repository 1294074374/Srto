/**
 * ��Ŀ����
�����������
��������:
����һ���ַ���S��������ַ����������Ƿ���ԣ�ֻ����"[", "]", "(", ")"
�������:
��ԣ�����true

����ԣ�����false
ʾ��1
����
����
abcd(])[efg
���
����
false
 */
package xiaozhao;

import java.util.Scanner;

public class Vipshop_�����������2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		char[] c = s.toCharArray();
		System.out.println(check(c));
	}

	private static boolean check(char[] c) {
		int daL = 0;
		int daR = 0;
		int xiaoL = 0;
		int xiaoR = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] == ')' && daR == 1) {
				return false;
			}
			if (c[i] == ']' && xiaoR == 1) {
				return false;
			}
			if (c[i] == ')' && xiaoL == 1 && daL == 1) {
				return false;
			}
			if (c[i] == ']' && daL == 1 && xiaoL == 1) {
				return false;
			}
			if (c[i] == '(' && xiaoL == 0) {
				xiaoL = 1;
			}
			if (c[i] == '[' && daL == 0) {
				daL = 1;
			}
			if (c[i] == ')' && xiaoL == 1) {
				xiaoL = 0;
			}
			if (c[i] == ']' && daL == 1) {
				daL = 0;
			}

		}
		return true;
	}
}
