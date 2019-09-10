/**
 * 给定�?个非负整数数组，你最初位于数组的第一个位置�??

数组中的每个元素代表你在该位置可以跳跃的�?大长度�??

判断你是否能够到达最后一个位置�??

示例 1:

输入: [2,3,1,1,4]
输出: true
解释: 从位�? 0 �? 1 �? 1 �?, 然后�? 3 步到达最后一个位置�??
示例 2:

输入: [3,2,1,0,4]
输出: false
解释: 无论怎样，你总会到达索引�? 3 的位置�?�但该位置的�?大跳跃长度是 0 �? �?以你永远不可能到达最后一个位置�??

来源：力扣（LeetCode�?
链接：https://leetcode-cn.com/problems/jump-game
著作权归领扣网络�?有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */

package leetcode.no001_099;

public class No55_Solution_跳跃游戏 {

	boolean res = false;

	public boolean canJump(int[] nums) {
		if (nums.length == 0) {
			return false;
		}
		return findCanJump(nums, 0);
	}

	private boolean findCanJump(int[] nums, int index) {
		if (index < 0) {
			return false;
		}
		if (index >= nums.length) {
			return true;
		}
		for (int i = nums[index]; i >= 1; i--) {
			if((findCanJump(nums, index + i))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		No55_Solution_跳跃游戏 n = new No55_Solution_跳跃游戏();
		int[] nums = { 3, 2, 1, 0, 4 };
		System.out.println(n.canJump(nums));
	}
}
