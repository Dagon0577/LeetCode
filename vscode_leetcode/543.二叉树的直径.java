/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        maxDep(root);
        return max;
    }

    private int maxDep(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDep(root.left);
        int right = maxDep(root.right);
        max = Math.max(max,left+right);
        return left > right ? left+1 : right+1;
    }
}
// @lc code=end

