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
    int result;
    public int findTilt(TreeNode root) {
        BST(root);
        return result;
    }
    private  int BST(TreeNode root){
        if(root==null)
            return 0;
        int left=BST(root.left);
        int right=BST(root.right);
        result+=Math.abs(left-right);
        return left+right+root.val;
    }
}