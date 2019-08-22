/**
 * 编写一个程序，通过已填充的空格来解决数独问题。

一个数独的解法需遵循如下规则：

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
空白格用 '.' 表示。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sudoku-solver
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package leetcode;

public class No37_Solution_解数独 {
	char[][] board={ { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
		{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
		{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
		{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
		{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }, };;

	public void solveSudoku(char[][] board) {
		this.board = board;
		dfs(0, 0);
	}

	private void dfs(int x, int y) {
		if (x == 8 && y == 9) {
			// 已经成功了，打印数组即可
			System.out.println("获取正确解");
			
			return;
		}

		// 已经到了列末尾了，还没到行尾，就换行
		if (y == 9) {
			x++;
			y = 0;
		}
		if (board[x][y] == '.') {
			for (int k = 0; k < 9; k++) {
				char temp = (char) (49 + k);
				if (check(temp, x, y)) {
					board[x][y] = temp;
					dfs(x, y + 1);
					board[x][y] = '.';
				}
			}
		} else {
			dfs(x, y + 1);
		}
	}

	private boolean check(char temp, int x, int y) {
		for (int i = 0; i < 9; i++) {
			if (board[x][i] == temp||board[i][y] == temp) {
				return false;
			}
		}
		
		int row = x / 3;
		int col = y / 3;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[row * 3 + i][col * 3 + j] == temp) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		No37_Solution_解数独 n = new No37_Solution_解数独();
		n.solveSudoku(n.board);
		
	}
}
