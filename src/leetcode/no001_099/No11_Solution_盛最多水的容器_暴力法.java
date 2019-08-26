/**
 * 给定 n 个非负整�??? a1，a2�???...，an，每个数代表坐标中的�???个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 
 * 的两个端点分别为 (i, ai) �??? (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳�???多的水�??

说明：你不能倾斜容器，且 n 的�?�至少为 2�???



图中垂直线代表输入数�??? [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的�???大�?�为 49�???

 

示例:

输入: [1,8,6,2,5,4,8,3,7]
输出: 49

来源：力扣（LeetCode�???
链接：https://leetcode-cn.com/problems/container-with-most-water
著作权归领扣网络�???有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */

package leetcode.no001_099;

public class No11_Solution_盛最多水的容器_暴力法 {
	public static void main(String[] args) {
		No11_Solution_盛最多水的容器_暴力法 s = new No11_Solution_盛最多水的容器_暴力法();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(s.maxArea(height));
	}

	public int maxArea(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int wight = Math.min(height[i], height[j]);
				int area = wight * (j - i);
				max = Math.max(area, max);
			}
		}
		return max;
	}
}
