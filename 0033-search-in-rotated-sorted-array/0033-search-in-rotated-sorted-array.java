class Solution {
    public int search(int[] nums, int target) {
        int answer = -1;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == target){
               answer = i;
               break;
           }
        }
        return answer; 
    }
}