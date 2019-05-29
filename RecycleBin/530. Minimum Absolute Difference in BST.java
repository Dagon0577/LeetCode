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
    int min=Integer.MAX_VALUE;
    int prev=-1;
    public int getMinimumDifference(TreeNode root) {
            if(root==null)
                return min;
            getMinimumDifference(root.left);
            if(prev!=-1)
                min=Math.min(root.val-prev,min);
            prev=root.val;
            getMinimumDifference(root.right);
        return min;
    }

}