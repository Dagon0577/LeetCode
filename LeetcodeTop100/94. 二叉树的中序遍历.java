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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private void helper(List<Integer> result, TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                helper(result, root.left);
            }
            result.add(root.val);
            helper(result, root.right);
        }
    }
}