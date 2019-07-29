/**
 * ��Ŀ����
HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:
�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */
package offer;

public class Solution_������������� {
	public static int[][] ARRAY;

	public int FindGreatestSumOfSubArray_demo(int[] array) {
		int[][] arr = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				arr[i][j] = sum;
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				if (result <= arr[i][j]) {
					result = arr[i][j];
				}
			}
		}
		return result;
	}

	public int FindGreatestSumOfSubArray(int[] array) {
		ARRAY = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				add(i, j, array);
			}
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i > j) {
					continue;
				}
				if (result <= ARRAY[i][j]) {
					result = ARRAY[i][j];
				}
			}
		}
		return result;
	}

	private void add(int i, int j, int[] arr) {
		int res = 0;
		for (int k = i; k <= j; k++) {
			res += arr[k];
		}
		ARRAY[i][j] = res;
	}

	public static void main(String[] args) {
		Solution_������������� s = new Solution_�������������();
		int[] test = { 6, -3, -2, 7, -15, 1, 2, 2, 2, -4, 2, -8, 11, 32, 95, 62, -93, 12 };
		System.out.println(s.FindGreatestSumOfSubArray_demo(test));
	}
}
