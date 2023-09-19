class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int answer = 0, currentPrefix = 0;
        prefixSum.put(0,1);
        for(int i = 0; i < nums.length; i++){
            currentPrefix += nums[i];
            answer += prefixSum.getOrDefault(currentPrefix -k, 0);
            prefixSum.put(currentPrefix,prefixSum.getOrDefault(currentPrefix, 0) + 1);
        }
        return answer;
    }
}