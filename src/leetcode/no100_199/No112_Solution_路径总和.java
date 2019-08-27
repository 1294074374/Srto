package leetcode.no100_199;

import leetcode.util.TreeNode;

public class No112_Solution_路径总和 {
	boolean flag = false;

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		int depth = getMaxDepth(root);
		if (depth == 1) {
			return root.val == sum;
		}
		dfs(root, root.val, 1, depth, sum);
		return flag;
	}

	private void dfs(TreeNode root, int ant, int nowDepth, int depth, int sum) {
		if (root == null) {
			return;
		}
		if (ant == sum && nowDepth == depth) {
			flag = true;
			return;
		}
		if (root.left != null) {
			dfs(root.left, ant + root.left.val, nowDepth + 1, depth, sum);
			ant = ant - root.left.val;
			nowDepth--;
		}
		if (root.right != null) {
			dfs(root.right, ant + root.right.val, nowDepth + 1, depth, sum);
			ant = ant - root.right.val;
			nowDepth--;
		}
	}

	public int getMaxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int left = getMaxDepth(root.left);
			int right = getMaxDepth(root.right);
			return 1 + Math.max(left, right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		No112_Solution_路径总和 n = new No112_Solution_路径总和();
		System.out.println(n.hasPathSum(root, 2));
	}
}
