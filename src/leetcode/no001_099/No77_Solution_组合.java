package leetcode.no001_099;

import java.util.ArrayList;
import java.util.List;

public class No77_Solution_组合 {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<>();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}
		res.add(new ArrayList<Integer>());
		for (int i = 0; i < nums.length; i++) {
			int all = res.size();
			for (int j = 0; j < all; j++) {
				List<Integer> temp = new ArrayList<Integer>(res.get(j));
				temp.add(nums[i]);
				res.add(temp);
			}
		}
		System.out.println(res);
		for (int i = 0; i < res.size(); i++) {
			if (res.get(i).size() != k) {
				res.remove(i);
				--i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		No77_Solution_组合 N = new No77_Solution_组合();
		int n = 4;
		int k = 2;
		System.out.println(N.combine(n, k));
	}
}
