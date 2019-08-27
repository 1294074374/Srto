package leetcode.no800_899;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No891_Solution_子序列宽度之和 {
	public int sumSubseqWidths(int[] A) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int result = 0;
		res.add(new ArrayList<Integer>());
		for (int i = 0; i < A.length; i++) {
			int all = res.size();
			for (int j = 0; j < all; j++) {
				List<Integer> temp = new ArrayList<Integer>(res.get(j));
				temp.add(A[i]);
				res.add(temp);
			}
		}
		//System.out.println(res);
		for (List<Integer> list : res) {
			if (list.size() >= 1) {
				Collections.sort(list);
				result = result+list.get(list.size() - 1) - list.get(0);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		No891_Solution_子序列宽度之和 n = new No891_Solution_子序列宽度之和();
		int[] A = { 1, 2, 3 };
		System.out.println(n.sumSubseqWidths(A));
	}
}
