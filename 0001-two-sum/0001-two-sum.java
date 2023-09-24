class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
            if(map.containsKey(j)){
                return new int[] {map.get(j),i};
            }
            map.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}