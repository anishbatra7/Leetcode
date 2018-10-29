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
    
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
       height(root);
       return max; 
    }
    
    private int height(TreeNode root){
        
        if(root == null) return 0;
        
        int left = height(root.left);
        
        int right = height(root.right);
        
        max = Math.max(max, left + right);
        
        return 1 + Math.max(left, right);
    }
}