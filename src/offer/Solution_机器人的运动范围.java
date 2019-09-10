package offer;

public class Solution_机器人的运动范围 {

	public int movingCount(int threshold, int rows, int cols) {
		int[][] map = new int[rows][cols];
		return find(map, threshold, rows, cols, 0, 0);
	}

	private int find(int[][] map, int threshold, int rows, int cols, int x, int y) {
		if (x < 0 || x >= rows || y < 0 || y >= cols || map[x][y] == 1) {
			return 0;
		}
		if (check(x, y, threshold)) {
			return 0;
		}
		map[x][y] = 1;
		return 1 + find(map, threshold, rows, cols, x - 1, y) + find(map, threshold, rows, cols, x + 1, y)
				+ find(map, threshold, rows, cols, x, y - 1) + find(map, threshold, rows, cols, x, y + 1);
	}

	private boolean check(int x, int y, int threshold) {
		int sum = 0;
		while (x > 0) {
			int temp = x % 10;
			sum += temp;
			x = x / 10;
		}
		while (y > 0) {
			int temp = y % 10;
			sum += temp;
			y = y / 10;
		}
		if (sum > threshold) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Solution_机器人的运动范围 s = new Solution_机器人的运动范围();
		System.out.println(s.movingCount(10, 6, 6));
	}
}
