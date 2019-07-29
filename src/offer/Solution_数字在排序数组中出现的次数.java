/**
 * ͳ��һ�����������������г��ֵĴ�����
 */
package offer;

import java.util.HashMap;

public class Solution_���������������г��ֵĴ��� {
	public int GetNumberOfK(int[] array, int k) {
		// �Ϸ����ж�
		if (array.length == 0) {
			return 0;
		}
		
		// ʹ��hashmap������
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		if (map.get(k) == null) {
			return 0;
		} else {
			return map.get(k);
		}
	}

	public static void main(String[] args) {
		Solution_���������������г��ֵĴ��� s = new Solution_���������������г��ֵĴ���();
		int[] test = {3};
		System.out.println(s.GetNumberOfK(test, 3));
	}
}
