/**
 * ��Ŀ����
��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 */
package offer;

public class Solution_��һ��ֻ����һ�ε��ַ� {
	public int FirstNotRepeatingChar(String str) {
		int[] words = new int[58];
		if (str != "" && str != null) {
			//return -1;

			for (int i = 0; i < str.length(); i++) {
				words[((int) str.charAt(i)) - 65] += 1;
			}
			for (int i = 0; i < words.length; i++) {
				if (words[((int) str.charAt(i)) - 65] == 1) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution_��һ��ֻ����һ�ε��ַ� s = new Solution_��һ��ֻ����һ�ε��ַ�();
		System.out.println(s.FirstNotRepeatingChar("sgeubislgnglksghalgngiengpp"));
	}
}
