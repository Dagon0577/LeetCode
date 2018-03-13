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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Double> array=new LinkedList<>();
        Queue<TreeNode> p=new LinkedList<>();
        
        p.add(root);
        while(!p.isEmpty()){
            int n=p.size();
            double sum=0;
            for(int i=0;i<n;i++){
                TreeNode tree=p.poll();
                sum+=tree.val;
                if(tree.left!=null){p.add(tree.left);}
                if(tree.right!=null){p.add(tree.right);}/*每一层遍历时，若该节点的子节点非空，就将子节点插入p队列中，该节点访问结束就出队列；每一层遍历结束时，这一层所有节点的子节点都已插入，在加上前面父节点出队列，此时p队列中的个数即为该层个数*/
            }
            array.add(sum/n);
        }
        return array;
    }
     
}