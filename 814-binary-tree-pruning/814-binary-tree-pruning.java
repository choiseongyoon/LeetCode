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
    public TreeNode pruneTree(TreeNode root) {
      return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode root) {
     if (root == null) {
       return false;
     }
    
      boolean lRes = containsOne(root.left);
      boolean rRes = containsOne(root.right);
      if (lRes == false) root.left = null;    
      if (rRes == false) root.right = null;

      return (root.val == 1) || lRes || rRes; 
    }
}