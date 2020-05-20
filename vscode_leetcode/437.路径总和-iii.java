/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        int rootRes = dfs(root,sum);
        int leftRes = pathSum(root.left,sum);
        int rightRes = pathSum(root.right,sum);
        return rootRes + leftRes + rightRes;
    }

    private int dfs(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        sum = sum - root.val;
        int result = sum == 0? 1 : 0;
        return result + dfs(root.left,sum) + dfs(root.right,sum);
    } 
}
// @lc code=end

