/**
 * 题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
package offer;

public class Solution_整数中1出现的次数从1到n整数中1出现的次数 {
	public int NumberOf1Between1AndN_Solution(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			String str = i + "";
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '1') {
					sum++;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Solution_整数中1出现的次数从1到n整数中1出现的次数 s = new Solution_整数中1出现的次数从1到n整数中1出现的次数();
		System.out.println(s.NumberOf1Between1AndN_Solution(13));
	}
}
