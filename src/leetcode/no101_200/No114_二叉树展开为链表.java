package leetcode.no101_200;

import leetcode.util.TreeNode;

public class No114_二叉树展开为链表 {
	public void flatten(TreeNode root) {
        if(root == null) return;
        if(root.left != null){
            TreeNode pre = root.left;
            while(pre.right != null) pre = pre.right;
            pre.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    } 
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode root2 = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(5);
		TreeNode root6 = new TreeNode(6);
		root.left = root2;
		root.right = root5;
		root2.left = root3;
		root2.right = root4;
		root5.right = root6;
		No114_二叉树展开为链表 n = new No114_二叉树展开为链表();
		n.flatten(root);
	}
}
