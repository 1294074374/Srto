
/**
 * ��Ŀ����
����һ�����������飬����������������ƴ�������ų�һ������
��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
���ӡ���������������ųɵ���С����Ϊ321323��
 */
package offer;

import java.util.TreeSet;

public class Solution_�������ų���С���� {
	TreeSet<Long> set = new TreeSet<Long>();

	public String PrintMinNumber(int[] numbers) {
		if(numbers.length == 0) {
			return "";
		}
		arrang(0, numbers);
		return set.first().toString();
	}

	public void arrang(int a, int[] number) {
		if (a == number.length) {
			String s = "";
			for (int k = 0; k < number.length; k++) {
				s += number[k];
			}
			Long res = Long.valueOf(s);
			set.add(res);
		}

		for (int i = a; i < number.length; i++) {
			int temp = number[i];
			number[i] = number[a];
			number[a] = temp;

			arrang(a + 1, number);

			temp = number[i];
			number[i] = number[a];
			number[a] = temp;
		}
	}

	public static void main(String[] args) {
		Solution_�������ų���С���� s = new Solution_�������ų���С����();
		int[] numbers = {};
		System.out.println(s.PrintMinNumber(numbers));
		
	}
}
