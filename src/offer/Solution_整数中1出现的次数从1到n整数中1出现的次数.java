/**
 * ��Ŀ����
���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
package offer;

public class Solution_������1���ֵĴ�����1��n������1���ֵĴ��� {
	public int NumberOf1Between1AndN_Solution(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			String str = i + "";
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '1') {
					sum++;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution_������1���ֵĴ�����1��n������1���ֵĴ��� s = new Solution_������1���ֵĴ�����1��n������1���ֵĴ���();
		System.out.println(s.NumberOf1Between1AndN_Solution(13));
	}
}
