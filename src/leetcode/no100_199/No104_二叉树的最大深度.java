package leetcode.no100_199;

import leetcode.util.TreeNode;

public class No104_�������������� {
	static int result = 0;

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		dfs(root, 1);
		return result;
	}

	private void dfs(TreeNode root, int n) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (n > result) {
				result = n;
			}
			return;
		}
		dfs(root.left, n + 1);
		dfs(root.right, n + 1);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode rootLeft = new TreeNode(9);
//		TreeNode rootRight = new TreeNode(20);
//		TreeNode rootRightLeft = new TreeNode(15);
//		TreeNode rootRightRight= new TreeNode(7);
		root.left = rootLeft;
//		root.right = rootRight;
//		rootRight.left = rootRightLeft;
//		rootRight.right = rootRightRight;
		No104_�������������� n = new No104_��������������();
		System.out.println(n.maxDepth(root));

	}
}
