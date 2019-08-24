/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package leetcode.no001_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15_Solution_三数之和 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		if (nums.length < 3) {
			return resList;
		}

		// 排序
		Arrays.sort(nums);
		int L = 0;
		int R = 0;
		for (int i = 0; i < nums.length; i++) {
			L = i + 1;
			R = nums.length - 1;
			if (nums[i] > 0) {
				// 最小的数都大于0 所以结束循环
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; // 去重
			}
			while (L < R) {
				if (nums[i] + nums[L] + nums[R] == 0) {
					List<Integer> tempList = new ArrayList<Integer>();
					tempList.add(nums[i]);
					tempList.add(nums[L]);
					tempList.add(nums[R]);
					resList.add(tempList);
					// 去重
					while (L < R && nums[L] == nums[L + 1]) {
						L++;
					}
					while (L < R && nums[R] == nums[R - 1]) {
						R--;
					}
					L++;
					R--;
				} else if (nums[i] + nums[L] + nums[R] < 0) {
					L++;
				} else if (nums[i] + nums[L] + nums[R] > 0) {
					R--;
				}
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		No15_Solution_三数之和 s = new No15_Solution_三数之和();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> resList = s.threeSum(nums);
		for (List<Integer> list : resList) {
			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
