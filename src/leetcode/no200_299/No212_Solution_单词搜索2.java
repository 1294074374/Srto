package leetcode.no200_299;

import java.util.ArrayList;
import java.util.List;

public class No212_Solution_单词搜索2 {
	List<String> resList = new ArrayList<String>();

	public List<String> findWords(char[][] board, String[] words) {
		int x = board.length;
		int y = board[0].length;
		int[] flag = new int[x * y];
		for (int k = 0; k < words.length; k++) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (!dfs(board, words[k], board[i][j] + "", 0, i, j, flag)) {
						flag = clear(flag);
					}
				}
			}
		}
		return resList;
	}

	private int[] clear(int[] flag) {
		int[] F = new int[flag.length];
		for (int i = 0; i < flag.length; i++) {
			F[i] = 0;
		}
		return F;
	}

	/**
	 * 
	 * @param board 字母矩阵
	 * @param word  目标字符串
	 * @param index 当前匹配的下表
	 * @param x     当前横坐标
	 * @param y     当前纵坐标
	 * @param flag  标记是否已经用过
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
			resList.add(word);
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
		No212_Solution_单词搜索2 n = new No212_Solution_单词搜索2();
		char[][] board = { { 'a', 'a' } };
		String word[] = { "a" };
		System.out.println(n.findWords(board, word));
	}
}
