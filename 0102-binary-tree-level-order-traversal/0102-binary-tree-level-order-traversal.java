/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return result;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>a=new ArrayList<>();
            int s=q.size();
            while(s-->0){
            TreeNode c=q.poll();
            a.add(c.val);
            if(c.left!=null){
                q.offer(c.left);
            }
            if(c.right!=null){
                q.offer(c.right);
            }
            }
            result.add(a);
        }
        return result;
    }
}