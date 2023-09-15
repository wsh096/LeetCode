class Solution {
public:
static bool cmp(pair<int, int> a, pair<int, int> b)
{
    return a.first > b.first;
}
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> result;
        unordered_map<int, int> m;
        for(int i = 0; i < nums.size(); i++)
        {
            m[nums[i]]++;
        }
        vector<pair<int,int>> v;
        for(auto x : m)
        {
            v.push_back(make_pair(x.second, x.first));
        }
        sort(v.begin(), v.end(), cmp);
        for(auto x : v)
        {
            if(k == 0) return result;
            result.push_back(x.second);
            k--;
        }
        return result;
    }
};