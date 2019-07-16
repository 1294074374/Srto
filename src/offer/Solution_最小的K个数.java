/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
package offer;

import java.util.ArrayList;

public class Solution_最小的K个数 {
	

	public static void main(String[] args) {
		int[] t = { 4, 5, 1, 6, 2, 7, 3, 8 };
		Solution_最小的K个数 s = new Solution_最小的K个数();
		ArrayList<Integer> res = s.GetLeastNumbers_Solution(t, 10);
		for (int i : res) {
			System.out.println(i);
		}
	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//检查输入的特殊情况
        if(input==null || input.length<=0 || input.length<k){
            return list;
        }
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		for (int l = 0; l < k; l++) {
			list.add(input[l]);
		}
		return list;
	}
}
