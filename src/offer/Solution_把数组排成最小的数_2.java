package offer;

import java.util.TreeSet;

public class Solution_把数组排成最小的数_2 {
	TreeSet<Long> set = new TreeSet<Long>();

	public String PrintMinNumber(int a, int[] number) {
		if (number.length == 0) {
			return "";
		}
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

			PrintMinNumber(a + 1, number);

			temp = number[i];
			number[i] = number[a];
			number[a] = temp;
		}

		return set.first().toString();
	}

	public static void main(String[] args) {
		Solution_把数组排成最小的数_2 s = new Solution_把数组排成最小的数_2();
		int[] numbers = { 3, 32, 321 };
		System.out.println(s.PrintMinNumber(0,numbers));

	}
}
