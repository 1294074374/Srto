
/**
 * 题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */
package offer;

import java.util.TreeSet;

public class Solution_把数组排成最小的数 {
	TreeSet<Long> set = new TreeSet<Long>();

	public String PrintMinNumber(int[] numbers) {
		if(numbers.length == 0) {
			return "";
		}
		arrang(0, numbers);
		return set.first().toString();
	}

	public void arrang(int a, int[] number) {
		if (a == number.length) {
			String s = "";
			for (int k = 0; k < number.length; k++) {
				s += number[k];
			}
			Long res = Long.valueOf(s);
			set.add(res);
		}

		for (int i = a; i < number.length; i++) {
			int temp = number[i];
			number[i] = number[a];
			number[a] = temp;

			arrang(a + 1, number);

			temp = number[i];
			number[i] = number[a];
			number[a] = temp;
		}
	}

	public static void main(String[] args) {
		Solution_把数组排成最小的数 s = new Solution_把数组排成最小的数();
		int[] numbers = {};
		System.out.println(s.PrintMinNumber(numbers));
		
	}
}
