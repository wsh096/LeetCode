class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int candidated = 0;
        int cnt = 0;
        for(int num : nums){
            if(cnt == 0){
                candidated = num;
            }
            cnt += (num == candidated) ? 1 : -1;
        }
        return candidated;
    }
};