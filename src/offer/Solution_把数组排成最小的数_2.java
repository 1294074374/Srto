package offer;

import java.util.TreeSet;

public class Solution_�������ų���С����_2 {
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
		Solution_�������ų���С����_2 s = new Solution_�������ų���С����_2();
		int[] numbers = { 3, 32, 321 };
		System.out.println(s.PrintMinNumber(0,numbers));

	}
}
