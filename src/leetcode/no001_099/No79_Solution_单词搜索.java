package leetcode.no001_099;

public class No79_Solution_�������� {
	public boolean exist(char[][] board, String word) {
		int x = board.length;
		int y = board[0].length;
		int[] flag = new int[x * y];
        if (x * y == 1) {
			if ((board[0][0] + "").equals(word)) {
				return true;
			} else {
				return false;
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (dfs(board, word, board[i][j] + "", 0, i, j, flag)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param board ��ĸ����
	 * @param word  Ŀ���ַ���
	 * @param index ��ǰƥ����±�
	 * @param x     ��ǰ������
	 * @param y     ��ǰ������
	 * @param flag  ����Ƿ��Ѿ��ù�
	 * @return
	 */
	private boolean dfs(char[][] board, String word, String str, int index, int x, int y, int[] flag) {
		int k = x * board[0].length + y;
		if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || flag[k] == 1) {
			return false;
		}
		if (board[x][y] != word.charAt(index)) {
			return false;
		}
		if (index == word.length() - 1) {
			return true;
		}
		flag[k] = 1;
		if (dfs(board, word, str + word.charAt(index), index + 1, x + 1, y, flag)
				|| dfs(board, word, str + word.charAt(index), index + 1, x - 1, y, flag)
				|| dfs(board, word, str + word.charAt(index), index + 1, x, y + 1, flag)
				|| dfs(board, word, str + word.charAt(index), index + 1, x, y - 1, flag)) {
			return true;
		}
		flag[k] = 0;
		return false;
	}

	public static void main(String[] args) {
		No79_Solution_�������� n = new No79_Solution_��������();
		char[][] board = { { 'a'} };
		String word = "a";
		System.out.println(n.exist(board, word));
	}
}
