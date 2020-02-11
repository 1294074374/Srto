package leetcode.no101_200;

import leetcode.util.TreeNode;

public class No129_求根到叶子节点数字之和 {
	static int result = 0;

	public int sumNumbers(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		dfs(root, root.val + "");
		return result;
	}

	private void dfs(TreeNode root, String s) {
		if (root == null || (root.left == null && root.right == null)) {
			int temp = Integer.valueOf(s);
			result = result + temp;
			return;
		}
		dfs(root.left, s + root.left.val);
		dfs(root.right, s + root.right.val);
	}
}
