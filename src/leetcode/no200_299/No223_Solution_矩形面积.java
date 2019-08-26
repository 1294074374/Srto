/**
 * 在二维平面上计算出两个由直线构成的矩形重叠后形成的�?�面积�??

每个矩形由其左下顶点和右上顶点坐标表示，如图�?示�??



示例:

输入: -3, 0, 3, 4, 0, -1, 9, 2
输出: 45
说明: 假设矩形面积不会超出 int 的范围�??
 */
package leetcode.no200_299;

public class No223_Solution_矩形面积 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if (E > C || A > G)
			return (C - A) * (D - B) + (G - E) * (H - F);
		if (F > D || H < B)
			return (C - A) * (D - B) + (G - E) * (H - F);
		int length = Math.max(A, E) - Math.min(C, G);
		int width = Math.max(B, F) - Math.min(D, H);
		return (C - A) * (D - B) + (G - E) * (H - F) - length * width;
	}

	public static void main(String[] args) {
		No223_Solution_矩形面积 n = new No223_Solution_矩形面积();
		System.out.println(n.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}
}
