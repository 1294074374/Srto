/**
 * ����һ��û���ظ����ֵ����У����������п��ܵ�ȫ���С�

ʾ��:

����: [1,2,3]
���:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

 */
package leetcode.no001_100;

import java.util.ArrayList;
import java.util.List;

public class No47_Solution_ȫ����2 {
	List<List<Integer>> resList = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {
		Perm(nums, 0, nums.length);
		return resList;
	}

	private void Perm(int[] nums, int k, int len) {
		if (k == len) {
			List<Integer> sta = new ArrayList<Integer>();
			for (int i = 0; i < len; i++) {
				sta.add(nums[i]);
			}

			resList.add(sta);

		} else {
			for (int j = k; j < len; j++) {
				if (check(nums, j, k)) {
					int temp = nums[j];
					nums[j] = nums[k];
					nums[k] = temp;

					Perm(nums, k + 1, len);

					temp = nums[j];
					nums[j] = nums[k];
					nums[k] = temp;
				}
			}
		}

	}

	private boolean check(int[] nums, int j, int k) {
		if (j != k) {
			if (nums[j] == nums[k]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		No47_Solution_ȫ����2 n = new No47_Solution_ȫ����2();
		int[] nums = { 1, 2, 2 };
		System.out.println(n.permute(nums));
	}
}
