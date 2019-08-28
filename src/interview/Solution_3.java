/**
 * ����һ������Ϊ n �ķǿ��������飬�ҵ�����������Ԫ����ȵ���С�ƶ�������ÿ���ƶ�����ʹ n - 1 ��Ԫ������ 1��

ʾ��:

����:
[1,2,3]

���:
3

����:
ֻ��Ҫ3���ƶ���ע��ÿ���ƶ�����������Ԫ�ص�ֵ����

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
package interview;

import java.util.Arrays;

public class Solution_3 {
	public int minMoves(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = nums.length - 1; i > 0; i--) {
			res += nums[i] - nums[0];

		}
		return res;
	}

	public static void main(String[] args) {
		Solution_3 s = new Solution_3();
		int[] nums = { 1, 2, 3 };
		System.out.println(s.minMoves(nums));
	}
}
