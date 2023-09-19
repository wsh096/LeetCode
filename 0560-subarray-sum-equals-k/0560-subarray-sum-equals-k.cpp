class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> prefixSum;
        int answer = 0, currentPrefix = 0;
        prefixSum[0]++;
        for(int i = 0; i <nums.size(); i++)
        {
            currentPrefix += nums[i];
            answer += prefixSum[currentPrefix - k];
            prefixSum[currentPrefix]++;
        }
        return answer;
    }
};