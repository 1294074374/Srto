/**
 * ��Ŀ����
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ������,
�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
��������:
��Ŀ��֤�����������û�е���ͬ������

���ݷ�Χ��

	����%50������,size<=10^4

	����%75������,size<=10^5

	����%100������,size<=2*10^5

ʾ��1
����
����
1,2,3,4,5,6,7,0
���
����
7
 */
package offer;

public class Solution_�����е������ {
	public int InversePairs(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length ; j++) {
				if (array[i] > array[j]) {
					sum++;
				}
			}
		}
		return sum % 1000000007;
	}

	public static void main(String[] args) {
		Solution_�����е������ s = new Solution_�����е������();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		System.out.println(s.InversePairs(array));
	}
}
