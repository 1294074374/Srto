
/**
 * ��Ŀ����
��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ��
���ַ����Գ�������Σ�����0�Σ��� �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 */
package offer;

public class Solution_������ʽƥ��2 {
	public boolean match(char[] str, char[] pattern) {
		// ����ģʽ����ƥ��ģʽ ����������һ��Ϊ���򷵻�false
		if (str.length == 0 || pattern.length == 0) {
			return false;
		}
		int strIndex = 0;
		int patternIndex = 0;
		return matchCore(str, strIndex, pattern, patternIndex);
	}

	public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		// ƥ��ɹ� ����true
		if (strIndex == str.length && patternIndex == pattern.length) {
			return true;
		}
		// �� ģʽ��ûƥ������ ��ƥ��ģʽ�Ѿ�����β�� ����false
		if (strIndex != str.length && patternIndex == pattern.length) {
			return false;
		}
		// ģʽ��2����*�����ַ�����1����ģʽ��1��ƥ��,��3��ƥ��ģʽ���粻ƥ�䣬ģʽ����2λ
		if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
			if ((str.length != strIndex && pattern[patternIndex] == str[strIndex])
					|| (str.length != strIndex && pattern[patternIndex] == '.')) {
				return matchCore(str, strIndex, pattern, patternIndex + 2)// ģʽ����2����Ϊx*ƥ��0���ַ�
						|| matchCore(str, strIndex + 1, pattern, patternIndex + 2)// ��Ϊģʽƥ��1���ַ�
						|| matchCore(str, strIndex + 1, pattern, patternIndex);// *ƥ��1������ƥ��str�е���һ��
			} else {
				matchCore(str, strIndex, pattern, patternIndex + 2);
			}
		} 
		// ģʽ��2������*�����ַ�����1����ģʽ��1��ƥ�䣬�򶼺���1λ������ֱ�ӷ���false
		if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
				|| (pattern[patternIndex] == '.' && strIndex != str.length)) {
			return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		}
		return false;
	}
}
