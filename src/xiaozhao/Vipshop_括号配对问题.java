/**
 * ��Ŀ����
�����������
��������:
����һ���ַ���S��������ַ����������Ƿ���ԣ�ֻ����"[", "]", "(", ")"
�������:
��ԣ�����true

����ԣ�����false
ʾ��1
����
����
abcd(])[efg
���
����
false
 */
package xiaozhao;

import java.util.Scanner;
import java.util.Stack;

public class Vipshop_����������� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		char[] c = s.toCharArray();
		System.out.println(check(c));
	}

	private static boolean check(char[] c) {
		Stack<Character> sta = new Stack<Character>();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '[') {
				sta.push(c[i]);
				continue;
			}
			if (c[i] == ')' && sta.isEmpty()) {
				return false;
			}
			if (c[i] == ']' && sta.isEmpty()) {
				return false;
			}
			if (c[i] == ')' && !sta.peek().equals('(')) {
				return false;
			}
			if (c[i] == ']' && !sta.peek().equals('[')) {
				return false;
			}
			if (c[i] == ')' && sta.peek().equals('(')) {
				sta.pop();
				continue;
			}
			if (c[i] == ']' && sta.peek().equals('[')) {
				sta.pop();
				continue;
			}
			
		}
		return true;
	}
}
