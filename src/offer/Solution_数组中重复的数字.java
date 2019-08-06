/**
 * ��Ŀ����
��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�
����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 */
package offer;

import java.util.HashMap;

public class Solution_�������ظ������� {

	public static void main(String[] args) {
		Solution_�������ظ������� s = new Solution_�������ظ�������();
		int[] numbers = {};
		int length = numbers.length;
		int[] duplication = new int[1];
		System.out.println(s.duplicate(numbers, length, duplication));
		System.out.println(duplication[0]);
	}

	/*
	 * Parameters: numbers: an array of integers length: the length of array numbers
	 * duplication: (Output) the duplicated number in the array number,length of
	 * duplication array is 1,so using duplication[0] = ? in implementation; Here
	 * duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
	 * ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0] Return value: true if the input is valid,
	 * and there are some duplications in the array number otherwise false
	 */
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (numbers == null || numbers.length == 0) {
			duplication[0] = -1;
			return false;
		}
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) == null) {
				map.put(numbers[i], 1);
			} else {
				map.put(numbers[i], map.get(numbers[i]) + 1);
			}
		}
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) >= 2) {
				duplication[j] = numbers[i];
				return true;
			}
		}

		return false;

	}
}
