/**
 * ��Ŀ����
��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
package offer;

import java.util.HashMap;

public class Solution_�����г��ִ�������һ������� {
	public static void main(String[] args) {
		Solution_�����г��ִ�������һ������� s = new Solution_�����г��ִ�������һ�������();
		int[] test = { 1, 2, 3, 2, 4, 2, 5, 2, 3 };
		System.out.println(s.MoreThanHalfNum_Solution(test));
	}

	public int MoreThanHalfNum_Solution(int[] array) {
		if (array.length == 1)
			return array[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) == null) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (map.get(array[i]) > array.length / 2) {
				return array[i];
			}
		}
		return 0;
	}
}
