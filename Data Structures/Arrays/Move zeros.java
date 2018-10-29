class Solution {
    public void moveZeroes(int[] nums) {
    
        // slow and fast pointer approach
        
        int i = 0;
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = 0;
                nums[i++] = temp;
            }
        }
    }
}