/**
 * ��Ŀ����
��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
 ����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
  ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
��������:
����һ���ַ���,����������ĸ����,����Ϊ��
�������:
����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
ʾ��1
����
����
+2147483647
    1a33
���
����
2147483647
    0


 */
package offer;

public class Soultion_���ַ���ת�������� {
	public static void main(String[] args) {
		Soultion_���ַ���ת�������� s = new Soultion_���ַ���ת��������();
		System.out.println(s.StrToInt("+123"));
	}

	public int StrToInt(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int sum = 0;
		char[] charArray = str.toCharArray();
		int symbol = 0;
		if (charArray[0] == '-') {
			symbol = 1;
		}
		for (int i = symbol; i < str.length(); i++) {
			if (charArray[i] == '+') {
				continue;
			}
			if (charArray[i] <= '0' || charArray[i] >= '9') {
				return 0;
			}
			sum = sum * 10 + charArray[i] - 48;
		}
		return symbol == 0 ? sum : sum * -1;
	}
}
