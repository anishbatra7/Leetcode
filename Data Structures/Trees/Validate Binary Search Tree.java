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
    public boolean isValidBST(TreeNode root) {
       
       if(root == null) return true; 
        
       return isValid(root, null, null); 
    }
    
    public boolean isValid(TreeNode node, Integer lower, Integer upper){
        
        if(lower != null && node.val <= lower) return false;
        if(upper != null && node.val >= upper) return false;
        
        boolean is_left_bst = true;
        boolean is_right_bst = true;
        
        if(node.left != null){
            is_left_bst = isValid(node.left, lower, node.val);
        }
        if(is_left_bst && node.right != null){
            is_right_bst = isValid(node.right, node.val, upper);
        }
        
        return is_left_bst && is_right_bst;
    }
}