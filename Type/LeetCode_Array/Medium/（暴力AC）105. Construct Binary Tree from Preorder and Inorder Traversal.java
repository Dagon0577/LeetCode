/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = getSubTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode getSubTree(int[] preorder, int sp, int ep, int[] inorder, int si, int ei) {
        if (sp > ep || si > ei)
            return null;
        TreeNode root = new TreeNode(preorder[sp]);
        for (int i = si; i <= ei; i++) {
            if (inorder[i] == preorder[sp]) {
                root.left = getSubTree(preorder, sp + 1, sp + i - si, inorder, si, i - 1);
                root.right = getSubTree(preorder, sp + i - si + 1, ep, inorder, i + 1, ei);
            }
        }
        return root;
    }
}