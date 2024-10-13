class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_map<int, int> find_unique_num;
        for(int n : nums)
                find_unique_num[n]++;
        for(auto n : find_unique_num){
            if(n.second == 1) return n.first;
        }
        return 0;
    }
};