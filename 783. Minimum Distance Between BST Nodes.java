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
    private int min = Integer.MAX_VALUE;
    private TreeNode prev;
    
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        
        if(prev==null)
            prev=root;
        else{
            min=Math.min(root.val-prev.val,min);
            prev=root;
        }
        
        inorder(root.right);
    }
}