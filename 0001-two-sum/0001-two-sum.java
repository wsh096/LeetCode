import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int differ = target - nums[i];

            if(map.containsKey(differ)){
                return new int[] {map.get(differ), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}