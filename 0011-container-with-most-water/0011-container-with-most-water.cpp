class Solution {
public:
    int maxArea(vector<int>& height) {
        int answer = 0, left = 0, right = height.size() - 1;
        while(left < right){
            int current = min(height[left], height[right]);
            answer = max(answer, current * (right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return answer;
    }

};