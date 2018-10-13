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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = helper(nums, 0, nums.length -1);
        
        return root;
    }
    
    public TreeNode helper(int[] nums, int left, int right){
        
        if(left > right) return null;
        
        int middle = (left+right)/2;
        
        TreeNode root = new TreeNode(nums[middle]);
        
        root.left = helper(nums, left, middle -1);
        root.right = helper(nums, middle + 1, right);
        
        return root;
    }
}