package leetcode.no200_299;

import java.util.HashMap;
import java.util.Map;

public class No217_Solution_�����ظ�Ԫ�� {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		No217_Solution_�����ظ�Ԫ�� n = new No217_Solution_�����ظ�Ԫ��();
		int[] nums = {1,2,3,4};
		System.out.println(n.containsDuplicate(nums));
	}
}
