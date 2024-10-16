class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int last_non_zero_num = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] != 0){
                swap(nums[last_non_zero_num], nums[i]);
                last_non_zero_num++;
            }
        }
    }
};