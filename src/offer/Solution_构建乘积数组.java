/**
 * ��Ŀ����
����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
 */
package offer;

public class Solution_�����˻����� {
	
	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		Solution_�����˻����� s = new Solution_�����˻�����();
		int[] B = s.multiply(A);
		for(int i = 0;i<B.length;i++) {
			System.out.println(B[i]);
		}
	}

	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int sum = 1;
			int j = -1;
			while (j < A.length - 1) {
				j++;
				if (j == i) {
					continue;
				}
				sum = sum * A[j];

			}
			B[i] = sum;
		}
		return B;
	}

}
