/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3��
 * ��ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
�������{2,3,4,2,6,2,5,1}�Ļ�������������6���� 
{[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� 
{2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� 
{2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */
package offer;

import java.util.ArrayList;

public class Solution_�������ڵ����ֵ {
	public static void main(String[] args) {
		Solution_�������ڵ����ֵ s = new Solution_�������ڵ����ֵ();
		int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
		int size = 3;
		ArrayList<Integer> list = s.maxInWindows(num, size);
		System.out.println(list);
	}

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (size <= 0 || num.length == 0) {
			return list;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length - size + 1; i++) {
			int j = i + size - 1;
			for (int k = i; k <= j; k++) {
				if (num[k] > max) {
					max = num[k];
				}
			}
			list.add(max);
			max = Integer.MIN_VALUE;
		}
		return list;
	}
}
