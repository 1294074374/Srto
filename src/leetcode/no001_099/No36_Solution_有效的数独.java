package leetcode.no001_099;

public class No36_Solution_有效的数独 {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (!checkRow(board, i)) {
				return false;
			}
		}
		for (int i = 0; i < board.length; i++) {
			if (!checkColum(board, i)) {
				return false;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!checkBolck(board, i * 3 , (i + 1) * 3, j * 3 , (j + 1) * 3 )) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean checkBolck(char[][] board, int x1, int x2, int y1, int y2) {
		int[] bolck = new int[board.length + 1];
		for (int i = x1; i < x2; i++) {
			for (int j = y1; j <y2; j++) {
				if (board[i][j] != '.') {
					int temp = board[i][j] - '0';
					bolck[temp]++;
				}
			}
		}
		for (int i = 0; i < bolck.length; i++) {
			if (bolck[i] >= 2) {
				return false;
			}
		}
		return true;
	}

	// 检查列
	private boolean checkColum(char[][] board, int c) {
		int[] col = new int[board.length + 1];
		for (int i = 0; i < board.length; i++) {
			if (board[i][c] != '.') {
				int temp = board[i][c] - '0';
				col[temp]++;
			}
		}
		for (int i = 0; i < col.length; i++) {
			if (col[i] >= 2) {
				return false;
			}
		}
		return true;
	}

	// 检查行
	private boolean checkRow(char[][] board, int r) {
		int[] row = new int[board.length + 1];
		for (int i = 0; i < board.length; i++) {
			if (board[r][i] != '.') {
				int temp = board[r][i] - '0';
				row[temp]++;
			}
		}
		for (int i = 0; i < row.length; i++) {
			if (row[i] >= 2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		No36_Solution_有效的数独 n = new No36_Solution_有效的数独();
		char[][] board = { 
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println(n.isValidSudoku(board));

	}
}
