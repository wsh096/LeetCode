class Solution {
public:
    bool subsetSumTok(int n, int k, std::vector<int>& arr) {
        std::vector<bool> prev(k + 1, false);

        prev[0] = true;

        if(arr[0] <= k) prev[arr[0]] = true;

        for(int i = 1; i < n; i++){
            std::vector<bool> cur(k + 1, false);
            cur[0] = true;
            for(int target = 1; target <= k; target++){
                bool notTaken = prev[target];

                bool taken = false;
                if(arr[i] <= target) taken = prev[target - arr[i]];

                cur[target] = notTaken || taken;                
            }
            prev = cur;
        }
        return prev[k];
    }
    bool canPartition(std::vector<int> & nums){
        int n = nums.size();
        if(n == 0) return false;

        int sum = 0;
        for(int num : nums) sum += num;

        if(sum % 2 != 0) return false;

        int targetSum = sum / 2;
        return subsetSumTok(n, targetSum, nums);
    }
};