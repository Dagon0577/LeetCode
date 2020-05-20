/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.right;
        if (root.left != null) {
            root.right = root.left;
        }
        if (root.left != null) {
            TreeNode deep = root.right;
            while (deep.right != null) {
                deep = deep.right;
            }
            deep.right = tmp;
        }
        root.left = null;
    }
}
// @lc code=end

