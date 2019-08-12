
/**
 * ��Ŀ����
�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ�
 ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·����
 ���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 */
package offer;

public class Solution_�����е�·�� {
	public static void main(String[] args) {
		Solution_�����е�·�� s = new Solution_�����е�·��();
		char[] matrix = { 'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e' };
		String st = "bcced";
		char[] str = st.toCharArray();
		System.out.println(s.hasPath(matrix, 3, 4, str));
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		int[] flag = new int[rows * cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (dfs(matrix, rows, cols, i, j, str, 0, flag)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
		int index = i * cols + j;
		// Խ���׳�
		if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1) {
			return false;
		}
		if (k == str.length - 1) {
			return true;
		}
		flag[index] = 1;
		if (	   dfs(matrix, rows, cols, i - 1, j, str, k + 1, flag) 
				|| dfs(matrix, rows, cols, i + 1, j, str, k + 1, flag)
				|| dfs(matrix, rows, cols, i, j - 1, str, k + 1, flag)
				|| dfs(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
			return true;
		}
		flag[index] = 0;
		return false;
	}

}
