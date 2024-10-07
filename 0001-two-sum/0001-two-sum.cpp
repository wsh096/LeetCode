//#include <unordered_map>
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //Index, nums
        unordered_map<int, int> map;
        int idx = 0;
        for(int i : nums){
            if(map.empty()){
                map[i] = idx++;
            }else{
                //target이 되는 형태가 있는 경우
                if(map.find(target - i) != map.end()){
                    return {map[target - i], idx};
                }else{
                    map[i] = idx++;
                }
            }
        }
        return {0};
    }
};