/**
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
package offer;

import java.util.ArrayList;

public class Solution_����ת�ַ��� {
	public static void main(String[] args) {
		Solution_����ת�ַ��� s = new Solution_����ת�ַ���();
		System.out.println(s.LeftRotateString("", 6));
	}

	public String LeftRotateString(String str, int n) {
		if (str == "" || str.length() < n) {
			return "";
		}
		char[] charArray = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);
		}
		for (int j = 0; j < n; j++) {
			list.add(list.get(j));
		}
		for (int j = 0; j < n; j++) {
			list.remove(0);
		}
		String s = "";
		for (Character c : list) {
			s += c;
		}
		return s;
	}
}
