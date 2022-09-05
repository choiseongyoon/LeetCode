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
    List<Double> list = new ArrayList<>();
    
    public List<Double> averageOfLevels(TreeNode root) {
       
    Queue<TreeNode> q = new LinkedList<TreeNode> (); 
        
    q.add(root); 
  
    while (!q.isEmpty()) { 
        int size = q.size();
        int divide = size;
        double sum=0;
        // Compute sum of nodes and 
        // count of nodes in current 
        // level. 
        while(--size>=0){
            TreeNode tree = q.poll();
            sum+=tree.val;
            if (tree.left != null) 
                q.add(tree.left);
             if (tree.right != null) 
                q.add(tree.right);
            }
        list.add(sum/divide); 
        } 
        return list;
        
    }
}