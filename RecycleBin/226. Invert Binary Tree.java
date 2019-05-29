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
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            invertTree(root.left);
            invertTree(root.right);
            TreeNode tree=null;
            tree=root.left;
            root.left=root.right;
            root.right=tree;
        }
        return root;
    }    
}