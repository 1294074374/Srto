package offer;

public class Solution_二叉树的深度 {

	public int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return maxDepth(root, 1);
	}

	private int maxDepth(TreeNode root, int m) {
		if (root == null) {
			return m;
		}
		int leftDepth = maxDepth(root.left, m + 1);
		int rightDepth = maxDepth(root.right, m + 1);
		return Math.max(leftDepth, rightDepth);
	}

	public static void main(String[] args) {
		Solution_二叉树的深度 s = new Solution_二叉树的深度();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.right.left = new TreeNode(7);
		System.out.println(s.TreeDepth(root));
	}
}
