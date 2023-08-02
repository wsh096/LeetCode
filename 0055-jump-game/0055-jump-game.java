class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int goal = nums.length-1;
        int maxReach = Math.min(goal, nums[0]); //갈 수 있는 최대 범위.
    
        for(int i = 0; i <= maxReach; i++){
            if(i + nums[i] >= maxReach) {
                maxReach = i + nums[i];
                if(maxReach >= goal) return true;
            }
        }
        return false;
    }
}