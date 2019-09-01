package leetcode.no500_599;

public class No566_Solution_ÖØËÜ¾ØÕó {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] res = new int[r][c];
		if (nums.length == 0) {
			return res;
		}
		if (nums.length * nums[0].length < r * c) {
			return nums;
		}
		if ((nums.length * nums[0].length == r * c) && (nums.length == r && nums[0].length == c)) {
			return nums;
		}
		int row = 0;
		int col = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				if (col == c) {
					col = 0;
					row++;
				}
				res[row][col] = nums[i][j];
				col++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		No566_Solution_ÖØËÜ¾ØÕó n = new No566_Solution_ÖØËÜ¾ØÕó();
		int[][] nums = { { 1, 2, 3, 4 } };
		int r = 2;
		int c = 2;
		System.out.println(n.matrixReshape(nums, r, c));
	}
}
