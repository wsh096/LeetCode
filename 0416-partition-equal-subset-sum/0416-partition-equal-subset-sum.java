class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % 2 != 0) return false;
        int req = sum / 2;
        int n = nums.length;
        boolean[] dp = new boolean[req + 1];
        dp[0] = true;
        for(int i = 0; i < n; i++){
            for(int j = req; j >= nums[i]; j--){
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[req];
    }
}