package leetcode.no001_099;

import java.util.ArrayList;
import java.util.List;

public class No78_Solution_子集 {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>());

		for (int i = 0; i < nums.length; i++) {
			int all = res.size();
			for (int j = 0; j < all; j++) {
				List<Integer> temp = new ArrayList<>(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		No78_Solution_子集 n = new No78_Solution_子集();
		System.out.println(n.subsets(nums));
	}

}
