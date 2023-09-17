class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum % 2 != 0) return false;
        int req = sum / 2;
        int n = nums.size();
        vector<bool> dp(req + 1, false);
        dp[0] = true;
        for(int i = 0; i < n; i++){
            for(int j = req; j >= nums[i]; j--){
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[req];
    }
};