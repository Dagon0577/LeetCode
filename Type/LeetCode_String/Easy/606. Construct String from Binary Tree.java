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
    public String tree2str(TreeNode t) {
        StringBuilder s=new StringBuilder();
        append(t, s);
        return s.toString();
    }
    public void append(TreeNode t,StringBuilder s){
       if(t==null)
        return;
        s.append(t.val);
        if(t.left!=null&&t.right!=null){
            s.append("(");
            append(t.left,s);
            s.append(")(");
            append(t.right,s);
            s.append(")");
        }else if(t.left!=null&&t.right==null){
            s.append("(");
            append(t.left,s);
            s.append(")");
        }else if(t.left==null&&t.right!=null){
            s.append("()(");
            append(t.right,s);
            s.append(")");
        }else return;
    }
}


