class Solution {
public:
    int singleNumber(vector<int>& nums) {
        set<int> find_unique_num;
        for(int n : nums){
            if(find_unique_num.find(n) != find_unique_num.end()){
                find_unique_num.erase(n);
            }else{
                find_unique_num.insert(n);
            }
        }
        int answer = 0;
        for(int i : find_unique_num){
            answer = i;
        }
        return answer;
    }
};