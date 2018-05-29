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
    public TreeNode convertBST(TreeNode root) {
        countBST(root,0);
        return root;
    }
    private int countBST(TreeNode root,int sum){
        if(root==null)
            return sum;
        int rightSum=countBST(root.right,sum);
        int leftSum=countBST(root.left,root.val+rightSum);
        root.val+=rightsum;
        return leftSum;
    }
}