/**
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
package offer;

import java.util.ArrayList;

public class Solution_��С��K���� {
	

	public static void main(String[] args) {
		int[] t = { 4, 5, 1, 6, 2, 7, 3, 8 };
		Solution_��С��K���� s = new Solution_��С��K����();
		ArrayList<Integer> res = s.GetLeastNumbers_Solution(t, 10);
		for (int i : res) {
			System.out.println(i);
		}
	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//���������������
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
