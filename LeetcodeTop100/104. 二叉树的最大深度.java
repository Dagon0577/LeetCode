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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root) + 1;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        if (root.left != null) {
            height = dfs(root.left) + 1;
        }
        if (root.right != null) {
            height = Math.max(height, dfs(root.right) + 1);
        }
        return height;
    }
}