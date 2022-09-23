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
    public static int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        //dfs
        /*if(root.left == null && root.right == null) 
            return targetSum - root.val == 0 ; // leaf node
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        */
        
        //bfs
        
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> n = new LinkedList<>();
        q.offer(root);
        n.offer(root.val);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            Integer sum = n.poll();
            if(cur.left == null && cur.right==null) { // leaf node
                if(sum == targetSum) return true;
            }
            if(cur.left != null){
                q.offer(cur.left);
                n.offer(cur.left.val + sum);
            }
            if(cur.right != null){
                q.offer(cur.right);
                n.offer(cur.right.val + sum);
            }
        }
        return false;
    }
}