class Solution {
    public int maxArea(int[] height) {
         int answer = 0, left = 0, right = height.length - 1;
        while(left < right) {
            int current = Math.min(height[left], height[right]);
            answer = Math.max(answer, current * (right - left));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return answer;
    }
}