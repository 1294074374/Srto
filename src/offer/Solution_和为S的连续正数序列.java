/**
 * ��Ŀ����
С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,
���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ��
�ҳ����к�ΪS��������������? Good Luck!
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 */
package offer;

import java.util.ArrayList;

public class Solution_��ΪS�������������� {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= sum - 1; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();

			int tempSum = i;
			list.add(i);
			for (int j = i + 1; j <= sum; j++) {
				tempSum += j;
				list.add(j);
				if (tempSum == sum) {
					resList.add(list);
					break;
				}
				if (tempSum > sum) {
					break;
				}
			}
		}
		return resList;
	}

	public static void main(String[] args) {
		Solution_��ΪS�������������� s = new Solution_��ΪS��������������();
		ArrayList<ArrayList<Integer>> resList = s.FindContinuousSequence(3);
		for (ArrayList<Integer> list : resList) {
			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
