/**
 * 题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
package offer;

public class Solution_构建乘积数组 {
	
	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		Solution_构建乘积数组 s = new Solution_构建乘积数组();
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
