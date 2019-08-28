package offer;


public class Solution_反转二叉树 {
	public void reverse(TreeNode root) {
		if(root == null){
			return;
		}
		if(root.left==null && root.right==null){
			return;
		}
		TreeNode temp = null;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left != null){
			reverse(root.left);
		}
		if(root.right != null){
			reverse(root.right);
		}
	}
	public static void main(String[] args) {
		
	}
}
class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}