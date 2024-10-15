class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size();
        int answer = 0;
        if(nums.size() == 1) return nums[0] < target ? 1 : 0;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                answer = mid;
                left = mid + 1;
            }else{
                right = mid;
            }
            if(left == right) answer = right;
        }
        return answer;
    }
};